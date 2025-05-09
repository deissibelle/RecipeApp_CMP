package com.example.recipeapp.features.feed.ui


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
fun FeedRoute(
//    navigateToDetail: (Long) -> Unit,
    feedViewModel: FeedViewModel = koinViewModel()
) {

    val feedUiState = feedViewModel.feedUiState.collectAsState()

    FeedScreen(
//        navigateToDetail = navigateToDetail,
        feedUiState = feedUiState.value,
    )

}

@Composable
fun FeedScreen(
//    navigateToDetail: (Long) -> Unit,
    feedUiState: FeedUiState,
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Feed Screen")
    }



    }



