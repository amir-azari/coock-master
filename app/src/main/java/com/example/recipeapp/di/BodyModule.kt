package com.example.recipeapp.di

import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.register.BodyRegister
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
object BodyModule {

    @Provides
    fun bodyRegister() = BodyRegister()

    @Provides
    fun bodyLogin() = BodyLogin()

    @Provides
    fun bodyEditeInfo() = BodyEditeInfo()

}