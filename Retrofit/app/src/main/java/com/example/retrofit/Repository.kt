package com.example.retrofit

import retrofit2.Response

class SonRepository {
    suspend fun getPostItem():Response<Post>{
        return  RetrofitInstance.API_JSON_PLACEHOLDER.getPostItem()
    }
}