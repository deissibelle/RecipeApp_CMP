package com.example.recipeapp.di

import com.example.recipeapp.features.feed.ui.FeedViewModel
import org.koin.core.module.dsl.viewModel

import org.koin.dsl.module


fun viewModelModule()  = module {

    viewModel {
        FeedViewModel(get())
    }



}