package com.example.recipeapp.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.profile.ProfileStoredModel
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

@ActivityRetainedScoped
class ProfileRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val remote: RemoteDataSource
) {
    //Api
    suspend fun getUserInfo(username: String) = remote.getUserInfo(username)

    //datastore

    private object StoredKey {
        val username = stringPreferencesKey(Constants.PROFILE_USERNAME_DATASTORE)
        val firstName = stringPreferencesKey(Constants.PROFILE_FIRSTNAME_DATASTORE)
        val lastName = stringPreferencesKey(Constants.PROFILE_LASTNAME_DATASTORE)
    }

    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(Constants.PROFILE_DATASTORE)

    suspend fun saveProfileData(
        username: String,
        firstName: String,
        lastName: String,

    ) {
        context.datastore.edit {
            it[StoredKey.username] = username
            it[StoredKey.firstName] = firstName
            it[StoredKey.lastName] = lastName


        }
    }
    val readProfileData: Flow<ProfileStoredModel> = context.datastore.data
        .catch { e ->
            if (e is IOException) {
                emit(emptyPreferences())
            } else {
                throw e
            }
        }
        .map {
            val username = it[StoredKey.username] ?: ""
            val firstName = it[StoredKey.firstName] ?: ""
            val lastName = it[StoredKey.lastName] ?: ""

            ProfileStoredModel(username, firstName, lastName)
        }
}