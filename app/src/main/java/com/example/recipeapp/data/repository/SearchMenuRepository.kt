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
import com.example.recipeapp.models.menu.SearchMenuStoredModel
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

@ActivityRetainedScoped
class SearchMenuRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private object StoredKey {

        val selectSortingTitle = stringPreferencesKey(Constants.SEARCH_MENU_SORTING_TITLE_KEY)
        val selectSortingId = intPreferencesKey(Constants.SEARCH_MENU_SORTING_ID_KEY)

        val selectOrderTitle = stringPreferencesKey(Constants.SEARCH_MENU_ORDER_TITLE_KEY)
        val selectOrderId = intPreferencesKey(Constants.SEARCH_MENU_ORDER_ID_KEY)

        val selectHour = intPreferencesKey(Constants.SEARCH_MENU_HOUR_KEY)
        val selectMinute = intPreferencesKey(Constants.SEARCH_MENU_MINUTE_KEY)
    }

    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(Constants.SEARCH_MENU_DATASTORE)

    suspend fun saveMenuData(
        sorting: String,
        sortingID: Int,
        order: String,
        orderID: Int,
        hour: Int,
        minute: Int
    ) {
        context.datastore.edit {
            it[StoredKey.selectSortingTitle] = sorting
            it[StoredKey.selectSortingId] = sortingID
            it[StoredKey.selectOrderTitle] = order
            it[StoredKey.selectOrderId] = orderID
            it[StoredKey.selectHour] = hour
            it[StoredKey.selectMinute] = minute

        }
    }
    val readMenuData: Flow<SearchMenuStoredModel> = context.datastore.data
        .catch { e ->
            if (e is IOException) {
                emit(emptyPreferences())
            } else {
                throw e
            }
        }
        .map {
            val selectSorting = it[StoredKey.selectSortingTitle] ?: ""
            val selectSortingId = it[StoredKey.selectSortingId] ?: 0
            val selectOrder = it[StoredKey.selectOrderTitle] ?: ""
            val selectOrderId = it[StoredKey.selectOrderId] ?: 0
            val selectHour = it[StoredKey.selectHour] ?: 0
            val selectMinute = it[StoredKey.selectMinute] ?: 0
            SearchMenuStoredModel(selectSorting, selectSortingId, selectOrder, selectOrderId, selectHour, selectMinute)
        }
}