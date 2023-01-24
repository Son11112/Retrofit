package com.example.retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SonViewModelFactory(private val repos: SonRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>):T{
        return SonViewModel(repos) as T
    }
}