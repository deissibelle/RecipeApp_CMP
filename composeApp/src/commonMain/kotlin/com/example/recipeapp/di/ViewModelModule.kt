package com.example.recipeapp.di

import com.example.recipeapp.features.detail.ui.RecipeDetailViewModel
import com.example.recipeapp.features.favorites.ui.FavoritesScreenViewModel
import com.example.recipeapp.features.feed.ui.FeedViewModel
import com.example.recipeapp.features.login.ui.LoginViewModel
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
        LoginViewModel()
    }
    viewModel {
        FavoritesScreenViewModel(get())
    }
}