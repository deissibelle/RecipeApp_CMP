package com.example.recipeapp.features.detail.navigation


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.recipeapp.features.app.data.Screen
import com.example.recipeapp.features.detail.ui.DetailRoute

const val RECIPE_ID_ARG = "recipeId"

fun NavController.navigateToDetail(id: Long, navOptions: NavOptions? = null) {
    navigate(Screen.Detail.createRoute(id), navOptions)
}


fun NavGraphBuilder.detailNavGraph(
    onBackClick: () -> Unit,
    isUserLoggedIn: () -> Boolean,
    openLoginBottomSheet: (() -> Unit) -> Unit,
) {

    composable(Screen.Detail.route,
        arguments = listOf(
            navArgument(RECIPE_ID_ARG) {
                type = NavType.LongType
            }
        )
    ) {
        val recipeId = it.arguments?.getLong(RECIPE_ID_ARG) ?: 0
        DetailRoute(
            recipeId,
            isUserLoggedIn = isUserLoggedIn,
            openLoginBottomSheet = openLoginBottomSheet,
            onBackClick = onBackClick
        )
    }

}