package com.example.recipeapp.di;

import com.example.recipeapp.models.register.BodyRegister;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/recipeapp/di/BodyModule;", "", "()V", "bodyRegister", "Lcom/example/recipeapp/models/register/BodyRegister;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.FragmentComponent.class})
public final class BodyModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.recipeapp.di.BodyModule INSTANCE = null;
    
    private BodyModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.register.BodyRegister bodyRegister() {
        return null;
    }
}