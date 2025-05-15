package com.example.recipeapp.features.favorites.data

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface FavoriteRecipeLocalDataSource {
    suspend fun getAllFavoriteRecipes(): List<RecipeItem>
    suspend fun addFavorite(recipeId: Long)
    suspend fun removeFavorite(recipeId: Long)
}