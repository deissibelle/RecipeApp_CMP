package com.example.recipeapp.features.tabs.navigation


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.recipeapp.features.app.data.Screen
import com.example.recipeapp.features.tabs.ui.TabsRoute

fun NavController.navigateToTabs(navOptions: NavOptions? = null) {
    navigate(Screen.Tabs.route)
}

fun NavGraphBuilder.tabsNavGraph(

    tabNavController: NavHostController,
    navigateToSearch: () -> Unit,
) {

    composable(Screen.Tabs.route) {
        TabsRoute(
            tabNavController = tabNavController,
            navigateToSearch = navigateToSearch
        )
    }

}
