package com.example.recipeapp.data.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.recipeapp.models.recipe.ResponseRecipes;
import com.example.recipeapp.utils.Constants;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/recipeapp/data/database/RecipeEntity;", "", "id", "", "response", "Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "(ILcom/example/recipeapp/models/recipe/ResponseRecipes;)V", "getId", "()I", "setId", "(I)V", "getResponse", "()Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "setResponse", "(Lcom/example/recipeapp/models/recipe/ResponseRecipes;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@androidx.room.Entity(tableName = "recipe_table_name")
public final class RecipeEntity {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id;
    @org.jetbrains.annotations.NotNull
    private com.example.recipeapp.models.recipe.ResponseRecipes response;
    
    public RecipeEntity(int id, @org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.recipe.ResponseRecipes response) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.recipe.ResponseRecipes getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.recipe.ResponseRecipes p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.recipe.ResponseRecipes component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.data.database.RecipeEntity copy(int id, @org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.recipe.ResponseRecipes response) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}