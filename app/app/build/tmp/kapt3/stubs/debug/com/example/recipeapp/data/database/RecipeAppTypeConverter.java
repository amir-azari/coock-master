package com.example.recipeapp.data.database;

import androidx.room.TypeConverter;
import com.example.recipeapp.models.recipe.ResponseRecipes;
import com.google.gson.Gson;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/recipeapp/data/database/RecipeAppTypeConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "recipeToJson", "", "recipe", "Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "stringToRecipe", "data", "app_debug"})
public final class RecipeAppTypeConverter {
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    public RecipeAppTypeConverter() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String recipeToJson(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.recipe.ResponseRecipes recipe) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.recipe.ResponseRecipes stringToRecipe(@org.jetbrains.annotations.NotNull
    java.lang.String data) {
        return null;
    }
}