package com.example.recipeapp.features.profile.ui

import com.example.recipeapp.features.profile.data.User

data class ProfileScreenUiState(
    val userInfo: User? = null,
    val isLoggedIn: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
)