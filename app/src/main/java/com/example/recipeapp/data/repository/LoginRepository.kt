package com.example.recipeapp.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.models.register.RegisterStoredModel
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

@ActivityRetainedScoped
class LoginRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val remote: RemoteDataSource,
) {

    //Api
    suspend fun postRegister(body: BodyLogin) = remote.postLogin(body)


}