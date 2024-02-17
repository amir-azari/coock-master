package com.example.recipeapp.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recipeapp.models.menu.MenuStoredModel
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

@ActivityRetainedScoped
class MenuRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private object StoredKey {
        val selectMealTitle = stringPreferencesKey(Constants.MENU_MEAL_TITLE_KEY)
        val selectMealId = intPreferencesKey(Constants.MENU_MEAL_ID_KEY)

        val selectDietTitle = stringPreferencesKey(Constants.MENU_DIET_TITLE_KEY)
        val selectDietId = intPreferencesKey(Constants.MENU_DIET_ID_KEY)

        val selectCuisineTitle = stringPreferencesKey(Constants.MENU_CUISINE_TITLE_KEY)
        val selectCuisineId = intPreferencesKey(Constants.MENU_CUISINE_ID_KEY)

        val selectSortingTitle = stringPreferencesKey(Constants.MENU_SORTING_TITLE_KEY)
        val selectSortingId = intPreferencesKey(Constants.MENU_SORTING_ID_KEY)

        val selectOrderTitle = stringPreferencesKey(Constants.MENU_ORDER_TITLE_KEY)
        val selectOrderId = intPreferencesKey(Constants.MENU_ORDER_ID_KEY)

        val selectHour = intPreferencesKey(Constants.MENU_HOUR_KEY)
        val selectMinute = intPreferencesKey(Constants.MENU_MINUTE_KEY)
    }

    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(Constants.MENU_DATASTORE)

    suspend fun saveMenuData(
        meal: String,
        mealId: Int,
        diet: String,
        dietId: Int,
        cuisine: String,
        cuisineID: Int,
        sorting: String,
        sortingID: Int,
        order: String,
        orderID: Int,
        hour: Int,
        minute: Int
    ) {
        context.datastore.edit {
            it[StoredKey.selectMealTitle] = meal
            it[StoredKey.selectMealId] = mealId
            it[StoredKey.selectDietTitle] = diet
            it[StoredKey.selectDietId] = dietId
            it[StoredKey.selectCuisineTitle] = cuisine
            it[StoredKey.selectCuisineId] = cuisineID
            it[StoredKey.selectSortingTitle] = sorting
            it[StoredKey.selectSortingId] = sortingID
            it[StoredKey.selectOrderTitle] = order
            it[StoredKey.selectOrderId] = orderID
            it[StoredKey.selectHour] = hour
            it[StoredKey.selectMinute] = minute

        }
    }

    val readMenuData: Flow<MenuStoredModel> = context.datastore.data
        .catch { e ->
            if (e is IOException) {
                emit(emptyPreferences())
            } else {
                throw e
            }
        }
        .map {
            val selectMeal = it[StoredKey.selectMealTitle] ?: ""
            val selectMealId = it[StoredKey.selectMealId] ?: 0
            val selectDiet = it[StoredKey.selectDietTitle] ?: ""
            val selectDietId = it[StoredKey.selectDietId] ?: 0
            val selectCuisine = it[StoredKey.selectCuisineTitle] ?: ""
            val selectCuisineId = it[StoredKey.selectCuisineId] ?: 0
            val selectSorting = it[StoredKey.selectSortingTitle] ?: ""
            val selectSortingId = it[StoredKey.selectSortingId] ?: 0
            val selectOrder = it[StoredKey.selectOrderTitle] ?: ""
            val selectOrderId = it[StoredKey.selectOrderId] ?: 0
            val selectHour = it[StoredKey.selectHour] ?: 0
            val selectMinute = it[StoredKey.selectMinute] ?: 0
            MenuStoredModel(
                selectMeal, selectMealId, selectDiet, selectDietId,
                selectCuisine, selectCuisineId, selectSorting, selectSortingId,
                selectOrder, selectOrderId, selectHour, selectMinute
            )
        }

}