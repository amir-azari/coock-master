package com.example.recipeapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants

@Entity(tableName = Constants.RECENT_RECIPE_TABLE_NAME)

data class RecentRecipeEntity(
    @PrimaryKey(autoGenerate = true)
    var idDb : Int = 0,
    var id: Int?= 0,
    var title : String?,
    var summary : String?,
    var aggregateLikes: Int?,
    var readyInMinutes: Int?,
    var healthScore: Int?,
    var image: String?,
    var vegan: Boolean?
)