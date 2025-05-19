package com.example.recipeapp.features.search.data.datasources

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface SearchRecipeLocalDataSource {
    suspend fun searchRecipesByText(query: String): List<RecipeItem>
}