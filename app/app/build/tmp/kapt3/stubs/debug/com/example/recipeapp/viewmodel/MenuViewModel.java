package com.example.recipeapp.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.recipeapp.data.repository.MenuRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/recipeapp/viewmodel/MenuViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/recipeapp/data/repository/MenuRepository;", "(Lcom/example/recipeapp/data/repository/MenuRepository;)V", "readMenuStoredItems", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/recipeapp/models/menu/MenuStoredModel;", "getReadMenuStoredItems", "()Lkotlinx/coroutines/flow/Flow;", "dietsList", "", "", "mealsList", "saveToStore", "Lkotlinx/coroutines/Job;", "meal", "mealId", "", "diet", "dietId", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MenuViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.repository.MenuRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.recipeapp.models.menu.MenuStoredModel> readMenuStoredItems = null;
    
    @javax.inject.Inject
    public MenuViewModel(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.repository.MenuRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveToStore(@org.jetbrains.annotations.NotNull
    java.lang.String meal, int mealId, @org.jetbrains.annotations.NotNull
    java.lang.String diet, int dietId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.recipeapp.models.menu.MenuStoredModel> getReadMenuStoredItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> mealsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> dietsList() {
        return null;
    }
}