package com.example.recipeapp.features.detail.data.datasources

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface RecipeDetailRemoteDataSource {
    suspend fun getRecipeDetail(id: Long): RecipeItem?
}