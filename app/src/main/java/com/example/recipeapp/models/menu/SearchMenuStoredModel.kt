package com.example.recipeapp.models.menu

data class SearchMenuStoredModel(
    val sorting: String,
    val sortingID: Int,
    val order: String,
    val orderID: Int,
    val hourValue: Int,
    val minValue : Int
)
