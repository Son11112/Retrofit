package com.example.retrofit

import com.example.retrofit.CmmVariable.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val API_JSON_PLACEHOLDER: APIJSONPlaceholder by lazy {
        retrofit.create(APIJSONPlaceholder::class.java)
    }
}