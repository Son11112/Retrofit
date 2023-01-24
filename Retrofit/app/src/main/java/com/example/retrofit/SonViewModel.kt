package com.example.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response


class SonViewModel (private val respos :SonRepository ): ViewModel(){
    val responseValue: MutableLiveData<Response<Post>> = MutableLiveData()
    fun getPostItem(){
        viewModelScope.launch{
            responseValue.value = respos.getPostItem()

        }
    }
}