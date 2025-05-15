package com.example.recipeapp.features.detail.repositories

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface RecipeDetailRepository {

    suspend fun getRecipesDetail(id: Long): Result<RecipeItem>
    suspend fun addFavorite(recipeId: Long)
    suspend fun removeFavorite(recipeId: Long)

}