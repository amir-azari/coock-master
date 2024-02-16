package com.example.recipeapp.models.profile

import com.google.gson.annotations.SerializedName

data class BodyEditeInfo(
    @SerializedName("firstName")
    var firstName: String? = null, // amir
    @SerializedName("lastName")
    var lastName: String? = null , // azari
    @SerializedName("username")
    var username: String? = null // amirAz
)
