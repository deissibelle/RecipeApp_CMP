package com.example.recipeapp.features.favorites.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.recipeapp.features.favorites.navigation.ui.FeedUiState
import com.example.recipeapp.features.favorites.navigation.ui.FeedViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FavoritesRoute() {
    FavoritesScreen()
}

@Composable
fun FavoritesScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Favorites Screen")
    }



}

