package com.example.recipeapp.models.register


import com.google.gson.annotations.SerializedName

data class ResponseRegister(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("message")
    val message: String?, // User registered successfully
    @SerializedName("status")
    val status: String?, // OK
    @SerializedName("totalCount")
    val totalCount: Int? // 1
) {
    data class Data(
        @SerializedName("firstName")
        val firstName: String?, // testfdsadsddd1s0
        @SerializedName("lastName")
        val lastName: String?, // testdsadadfdf1s0
        @SerializedName("password")
        val password: String?, // tesfddsadtdsf1s0
        @SerializedName("username")
        val username: String? // sadsgghfdfdddghgad
    )
}