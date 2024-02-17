package com.example.recipeapp.models.profile

import com.google.gson.annotations.SerializedName

data class BodyPassword(
    @SerializedName("newPassword")
    var newPassword: String? = null, // amir123456
    @SerializedName("oldPassword")
    var oldPassword: String? = null // amir1234556
)
