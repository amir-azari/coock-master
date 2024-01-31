package com.example.recipeapp.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/recipeapp/data/database/RecipeAppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/example/recipeapp/data/database/RecipeAppDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.recipeapp.data.database.RecipeEntity.class}, version = 3, exportSchema = false)
@androidx.room.TypeConverters(value = {com.example.recipeapp.data.database.RecipeAppTypeConverter.class})
public abstract class RecipeAppDatabase extends androidx.room.RoomDatabase {
    
    public RecipeAppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.recipeapp.data.database.RecipeAppDao dao();
}