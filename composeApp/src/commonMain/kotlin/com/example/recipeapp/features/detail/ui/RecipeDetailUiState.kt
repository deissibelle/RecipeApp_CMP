package com.example.recipeapp.features.detail.ui

import com.example.recipeapp.features.common.domain.entities.RecipeItem


data class RecipeDetailUiState(
    val recipesDetail: RecipeItem? = null,
    val recipesDetailIsLoading: Boolean = true,
    val recipesDetailError: String? = null,
)