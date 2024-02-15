package com.example.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.SearchMenuRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchMenuViewModel @Inject constructor(private val repository: SearchMenuRepository) :
    ViewModel() {

    fun saveToStore(
        sorting: String,
        sortingId: Int,
        order: String,
        orderId: Int,
        hours: Int,
        min: Int
    ) = viewModelScope.launch(Dispatchers.IO) {
        repository.saveMenuData(sorting, sortingId, order, orderId, hours, min)


    }
    val readMenuStoredItems = repository.readMenuData

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