package com.example.recipeapp.features.profile.navigation


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.recipeapp.features.app.data.Screen
import com.example.recipeapp.features.profile.ui.ProfileRoute

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    navigate(Screen.Profile.route)
}

fun NavGraphBuilder.profileNavGraph(
    isUserLoggedIn: () -> Boolean,
    openLoginBottomSheet: (() -> Unit) -> Unit,
    onLogout: () -> Unit
) {

    composable(Screen.Profile.route) {
        ProfileRoute(
            isUserLoggedIn, openLoginBottomSheet, onLogout
        )
    }

}
