package com.example.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface APIJSONPlaceholder {
    @GET("post/1")
    suspend fun getPostItem():Response<Post>
}