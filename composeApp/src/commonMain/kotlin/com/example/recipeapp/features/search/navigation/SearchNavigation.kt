package com.example.recipeapp.features.search.navigation


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.recipeapp.features.app.data.Screen
import com.example.recipeapp.features.favorites.ui.FavoritesRoute
import com.example.recipeapp.features.search.ui.SearchRoute

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    navigate(Screen.Search.route)
}

fun NavGraphBuilder.searchNavGraph(
    navigateToDetail: (Long) -> Unit,
    onBackPress: () -> Unit
) {

    composable(Screen.Search.route) {
        SearchRoute(
            navigateToDetail = navigateToDetail,
            onBackPress = onBackPress
        )
    }

}
