package com.example.recipeapp.models.menu

data class MenuStoredModel(
    val meal: String,
    val mealId: Int,
    val diet: String,
    val dietId: Int,
    val cuisine: String,
    val cuisineID: Int,
    val sorting: String,
    val sortingID: Int,
    val order: String,
    val orderID: Int
)
