package com.example.recipeapp.features.favorites.navigation.ui

import com.example.recipeapp.features.common.domain.entities.RecipeItem

data class FeedUiState(
    val recipesList: List<RecipeItem>? = null,
    val recipesListIsLoading: Boolean = true,
    val recipesListError: String? = null,
)