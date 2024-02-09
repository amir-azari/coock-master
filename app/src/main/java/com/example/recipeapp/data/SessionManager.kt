package com.example.recipeapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recipeapp.models.register.RegisterStoredModel
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class SessionManager @Inject constructor(@ApplicationContext private val context: Context) {
    private val appContext = context.applicationContext

    //Store user info
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(Constants.USER_INFO)
        val usernameKey = stringPreferencesKey(Constants.REGISTER_USERNAME)

    }


    suspend fun saveToken(username: String) {
        appContext.dataStore.edit {
            it[usernameKey] = username
        }
    }

    val getToken: Flow<String?> = appContext.dataStore.data
        .catch { e ->
            if (e is IOException) {
                emit(emptyPreferences())
            } else {
                throw e
            }
        }.map {
            it[usernameKey]
        }


    suspend fun clearToken() {
        appContext.dataStore.edit {
            it.clear()
        }
    }
}