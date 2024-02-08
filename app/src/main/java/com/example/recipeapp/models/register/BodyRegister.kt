package com.example.recipeapp.models.register


import com.google.gson.annotations.SerializedName

data class BodyRegister(
    @SerializedName("firstName")
    var firstName: String?= null, // your user's first name
    @SerializedName("lastName")
    var lastName: String?= null, // your user's last name
    @SerializedName("username")
    var username: String?= null,// your user's name
    @SerializedName("password")
    var password: String?= null // your user's name
)