package com.example.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.MenuRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(private val repository: MenuRepository) : ViewModel() {

    fun saveToStore(
        meal: String,
        mealId: Int,
        diet: String,
        dietId: Int,
        cuisine: String,
        cuisineId: Int,
        sorting: String,
        sortingId: Int,
        order: String,
        orderId: Int
    ) = viewModelScope.launch(Dispatchers.IO) {
        repository.saveMenuData(
            meal,
            mealId,
            diet,
            dietId,
            cuisine,
            cuisineId,
            sorting,
            sortingId,
            order,
            orderId
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

    fun sortingList(): MutableList<String> {
        return mutableListOf(
            "Popularity",
            "Healthiness",
            "Price",
            "Time",
            "Random",
            "Alcohol",
            "Caffeine",
            "Energy",
            "Calories",
            "Calcium",
            "Carbohydrates",
            "Carbs",
            "Cholesterol",
            "Total-fat",
            "Fiber",
            "Folic-acid",
            "Iodine",
            "Iron",
            "Magnesium",
            "Manganese",
            "Phosphorus",
            "Potassium",
            "Protein",
            "Selenium",
            "Sodium",
            "Sugar"
        )
    }

    fun orderList(): MutableList<String> {
        return mutableListOf(
            "Ascending",
            "Descending",
        )
    }
}