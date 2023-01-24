package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: SonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vmFactory = SonViewModelFactory(SonRepository())
        viewModel = ViewModelProvider(this, vmFactory).get(SonViewModel::class.java)
        viewModel.getPostItem()
        viewModel.responseValue.observe(this) { res ->
            if (res.isSuccessful) {
                val resultString = res.body().toString()
                Log.d("MainActivity", "Thanh cong")
                Toast.makeText(this, resultString, Toast.LENGTH_LONG).show()
            } else {
                Log.d("MainActivity", "that bai")
            }
        }
    }
}