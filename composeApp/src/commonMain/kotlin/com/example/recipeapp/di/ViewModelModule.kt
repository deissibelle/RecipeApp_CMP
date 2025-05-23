package com.example.recipeapp.di

import com.example.recipeapp.features.detail.ui.RecipeDetailViewModel
import com.example.recipeapp.features.favorites.ui.FavoritesScreenViewModel
import com.example.recipeapp.features.feed.ui.FeedViewModel
import com.example.recipeapp.features.login.ui.LoginViewModel
import com.example.recipeapp.features.profile.ui.ProfileViewModel
import com.example.recipeapp.features.search.ui.SearchViewModel
import org.koin.core.module.dsl.viewModel

import org.koin.dsl.module


fun viewModelModule()  = module {

    viewModel {
        FeedViewModel(get())
    }
    viewModel {
        RecipeDetailViewModel(get())
    }
    viewModel {
        FavoritesScreenViewModel(get())
    }
    viewModel {
        ProfileViewModel()
    }
    viewModel {
        LoginViewModel()
    }
    viewModel {
        SearchViewModel(get())
    }
}