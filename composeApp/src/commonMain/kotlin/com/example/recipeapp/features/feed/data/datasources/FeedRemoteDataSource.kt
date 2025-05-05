package com.example.recipeapp.features.feed.data.datasources

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface FeedRemoteDataSource {
    suspend fun getRecipesList(): List<RecipeItem>
}