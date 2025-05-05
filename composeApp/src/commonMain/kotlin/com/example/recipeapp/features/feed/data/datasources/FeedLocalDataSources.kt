package com.example.recipeapp.features.feed.data.datasources

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface FeedLocalDataSource {
    suspend fun getRecipesList(): List<RecipeItem>
    suspend fun saveRecipesList(recipes: List<RecipeItem>)
}