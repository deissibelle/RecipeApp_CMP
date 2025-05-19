package com.example.recipeapp.features.search.domain.repositories

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface SearchRecipeRepository {
    suspend fun searchRecipesByText(query: String): Result<List<RecipeItem>>
}