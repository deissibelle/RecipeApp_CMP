package com.example.recipeapp.features.detail.data.datasources


data class  RecipeDetailUpdateIsFavUiState(
    val isSuccess: Boolean? = null,
    val isUpdating: Boolean = true,
    val error: String? = null,
)