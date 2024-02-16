package com.example.recipeapp.models.profile


import com.google.gson.annotations.SerializedName

data class ResponseProfile(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("message")
    val message: String?, // User retrieved successfully
    @SerializedName("status")
    val status: String?, // OK
    @SerializedName("totalCount")
    val totalCount: Int? // 1
) {
    data class Data(
        @SerializedName("firstName")
        val firstName: String?, // amir
        @SerializedName("lastName")
        val lastName: String?, // azari
        @SerializedName("password")
        val password: Any?, // null
        @SerializedName("username")
        val username: String? // amirAz
    )
}