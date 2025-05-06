package com.example.recipeapp.features.feed.domain.repositories

import com.example.recipeapp.features.common.domain.entities.RecipeItem

interface FeedRepository{
    suspend fun getRecipesList(): Result<List<RecipeItem>>
}