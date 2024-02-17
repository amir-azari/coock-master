package com.example.recipeapp.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recipeapp.models.menu.LuckyMenuStoredModel
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
class LuckyMenuRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private object StoredKey {
        val selectMealTitle = stringPreferencesKey(Constants.LUCKY_MENU_MEAL_TITLE_KEY)
        val selectMealId = intPreferencesKey(Constants.LUCKY_MENU_MEAL_ID_KEY)

        val selectDietTitle = stringPreferencesKey(Constants.LUCKY_MENU_DIET_TITLE_KEY)
        val selectDietId = intPreferencesKey(Constants.LUCKY_MENU_DIET_ID_KEY)

        val selectCuisineTitle = stringPreferencesKey(Constants.LUCKY_MENU_CUISINE_TITLE_KEY)
        val selectCuisineId = intPreferencesKey(Constants.LUCKY_MENU_CUISINE_ID_KEY)

    }

    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(Constants.LUCKY_MENU_DATASTORE)

    suspend fun saveMenuData(
        meal: String,
        mealId: Int,
        diet: String,
        dietId: Int,
        cuisine: String,
        cuisineID: Int
    ) {
        context.datastore.edit {
            it[StoredKey.selectMealTitle] = meal
            it[StoredKey.selectMealId] = mealId
            it[StoredKey.selectDietTitle] = diet
            it[StoredKey.selectDietId] = dietId
            it[StoredKey.selectCuisineTitle] = cuisine
            it[StoredKey.selectCuisineId] = cuisineID


        }
    }

    val readMenuData: Flow<LuckyMenuStoredModel> = context.datastore.data
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

            LuckyMenuStoredModel(
                selectMeal, selectMealId, selectDiet, selectDietId,
                selectCuisine, selectCuisineId
            )
        }

    suspend fun clearMenuData() {
        context.datastore.edit {
            it.clear()
        }
    }
}