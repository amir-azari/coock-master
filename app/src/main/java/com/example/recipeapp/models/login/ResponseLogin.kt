package com.example.recipeapp.models.login


import com.google.gson.annotations.SerializedName

data class ResponseLogin(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("message")
    val message: String?, // Login successful
    @SerializedName("status")
    val status: String?, // OK
    @SerializedName("totalCount")
    val totalCount: Int? // 1
) {
    data class Data(
        @SerializedName("username")
        val username: String? // amirspik001
    )
}