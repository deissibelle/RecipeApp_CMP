package com.example.recipeapp.features.favorites.domain

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface FavoriteRecipeRepository {
    suspend fun getAllFavoriteRecipes(): Result<List<RecipeItem>>
    suspend fun addFavorite(recipeId: Long)
    suspend fun removeFavorite(recipeId: Long)
}