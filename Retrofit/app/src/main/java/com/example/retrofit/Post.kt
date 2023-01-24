package com.example.retrofit

import android.icu.text.CaseMap.Title
import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId")
    val userId:Int,
    val id:Int,
    val title: String,
    val body:String

    )
