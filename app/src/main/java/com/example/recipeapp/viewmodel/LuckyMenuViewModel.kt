package com.example.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.LuckyMenuRepository
import com.example.recipeapp.data.repository.MenuRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LuckyMenuViewModel @Inject constructor(private val repository: LuckyMenuRepository) : ViewModel() {

    fun saveToStore(meal: String, mealId: Int, diet: String, dietId: Int, cuisine: String, cuisineId: Int)
    = viewModelScope.launch(Dispatchers.IO) {
        repository.saveMenuData(
            meal,
            mealId,
            diet,
            dietId,
            cuisine,
            cuisineId,

        )
    }

    val readMenuStoredItems = repository.readMenuData

    fun mealsList(): MutableList<String> {
        return mutableListOf(
            "Main Course",
            "Bread",
            "Marinade",
            "Side Dish",
            "Breakfast",
            "Dessert",
            "Soup",
            "Snack",
            "Appetizer",
            "Beverage",
            "Drink",
            "Salad",
            "Sauce"
        )
    }

    fun dietsList(): MutableList<String> {
        return mutableListOf(
            "Gluten Free",
            "Ketogenic",
            "Vegetarian",
            "Vegan",
            "Pescetarian",
            "Paleo"
        )
    }

    fun cuisineList(): MutableList<String> {
        return mutableListOf(
            "African",
            "Asian",
            "American",
            "British",
            "Cajun",
            "Caribbean",
            "Chinese",
            "Eastern European",
            "European",
            "French",
            "German",
            "Greek",
            "Indian",
            "Irish",
            "Italian",
            "Japanese",
            "Jewish",
            "Korean",
            "Latin American",
            "Mediterranean",
            "Mexican",
            "Middle Eastern",
            "Nordic",
            "Southern",
            "Spanish",
            "Thai",
            "Vietnamese"
        )
    }

}