package com.example.recipeapp.models.login

import com.google.gson.annotations.SerializedName

data class BodyLogin (
    @SerializedName("username")
    var username: String?= null,// your user's name
    @SerializedName("password")
    var password: String?= null // your user's name
)
