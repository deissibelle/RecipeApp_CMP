package com.example.recipeapp.features.favorites.ui

import com.example.recipeapp.features.common.domain.entities.RecipeItem

data class FavoritesScreenUiState(
    val itemsList: List<RecipeItem>? = null,
    val itemsListIsLoading: Boolean = true,
    val itemsListError: String? = null,
)