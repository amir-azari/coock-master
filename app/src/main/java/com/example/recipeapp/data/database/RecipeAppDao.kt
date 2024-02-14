package com.example.recipeapp.data.database

import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.recipeapp.data.database.entity.DetailEntity
import com.example.recipeapp.data.database.entity.FavoriteEntity
import com.example.recipeapp.data.database.entity.RecentRecipeEntity
import com.example.recipeapp.data.database.entity.RecipeEntity
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeAppDao {
    //Recipe
    @Insert(onConflict = REPLACE)
    suspend fun saveRecipes(entity: RecipeEntity)

    @Query("SELECT * FROM ${Constants.RECIPE_TABLE_NAME} ORDER BY ID ASC")
    fun loadRecipes(): Flow<List<RecipeEntity>>

    //Recent
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun saveRecentRecipes(entity: RecentRecipeEntity)
    @Query("SELECT * FROM ${Constants.RECENT_RECIPE_TABLE_NAME} ")
    fun loadRecentRecipes(): Flow<List<RecentRecipeEntity>>
    @Query("DELETE FROM ${Constants.RECENT_RECIPE_TABLE_NAME}")
    suspend fun clearRecentData()

    //Detail
    @Insert(onConflict = REPLACE)
    suspend fun saveDetail(entity: DetailEntity)

    @Query("SELECT * FROM ${Constants.DETAIL_TABLE_NAME} WHERE id = :id")
    fun loadDetail(id: Int): Flow<DetailEntity>

    @Query("SELECT EXISTS (SELECT 1 FROM ${Constants.DETAIL_TABLE_NAME} WHERE ID = :id)")
    fun existsDetail(id: Int): Flow<Boolean>

    //Favorite
    @Insert(onConflict = REPLACE)
    suspend fun saveFavorite(entity: FavoriteEntity)

    @Delete
    suspend fun deleteFavorite(entity: FavoriteEntity)

    @Query("SELECT * FROM ${Constants.FAVORITE_TABLE_NAME} ORDER BY ID ASC")
    fun loadFavorites(): Flow<List<FavoriteEntity>>

    @Query("SELECT EXISTS (SELECT 1 FROM ${Constants.FAVORITE_TABLE_NAME} WHERE ID = :id)")
    fun existsFavorite(id: Int): Flow<Boolean>


}