package com.example.recipeapp.features.detail.navigation


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.recipeapp.features.app.data.Screen
import com.example.recipeapp.features.detail.ui.DetailRoute

fun NavController.navigateToDetail(
    navOptions: NavOptions?=null
){
    navigate(Screen.Detail.route)
}
fun NavGraphBuilder.detailNavGraph(

) {

    composable(Screen.Detail.route) {
        DetailRoute()
    }


}
