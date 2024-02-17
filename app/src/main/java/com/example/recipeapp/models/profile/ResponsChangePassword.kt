package com.example.recipeapp.models.profile


import com.google.gson.annotations.SerializedName

data class ResponsChangePassword(
    @SerializedName("data")
    val `data`: Any?, // null
    @SerializedName("message")
    val message: String?, // Incorrect old password
    @SerializedName("status")
    val status: String?, // UNAUTHORIZED
    @SerializedName("totalCount")
    val totalCount: Int? // 0
)