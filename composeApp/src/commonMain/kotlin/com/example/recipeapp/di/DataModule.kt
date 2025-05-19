package com.example.recipeapp.di

import com.example.recipeapp.features.detail.data.datasources.RecipeDetailLocalDataSource
import com.example.recipeapp.features.detail.data.datasources.RecipeDetailLocalDataSourceImpl
import com.example.recipeapp.features.detail.data.datasources.RecipeDetailRemoteDataSource
import com.example.recipeapp.features.detail.data.datasources.RecipeDetailRemoteDataSourceImpl
import com.example.recipeapp.features.feed.data.datasources.FeedLocalDataSource
import com.example.recipeapp.features.feed.data.datasources.FeedLocalDataSourceImpl
import com.example.recipeapp.features.feed.data.datasources.FeedRemoteDataSource
import com.example.recipeapp.features.feed.data.datasources.FeedRemoteDataSourceImpl
import com.example.recipeapp.features.feed.data.repositories.FeedRepositoryImpl
import com.example.recipeapp.features.feed.domain.repositories.FeedRepository
import org.koin.dsl.module
import com.example.recipeapp.features.detail.data.repositories.RecipeDetailRepositoryImpl
import com.example.recipeapp.features.detail.repositories.RecipeDetailRepository
import com.example.recipeapp.features.favorites.data.FavoriteRecipeLocalDataSource
import com.example.recipeapp.features.favorites.data.FavoriteRecipeLocalDataSourceImpl
import com.example.recipeapp.features.favorites.data.FavoriteRecipeRepositoryImpl
import com.example.recipeapp.features.favorites.domain.FavoriteRecipeRepository
import com.example.recipeapp.features.search.data.datasources.SearchRecipeLocalDataSource
import com.example.recipeapp.features.search.data.datasources.SearchRecipeLocalDataSourceImpl
import com.example.recipeapp.features.search.data.repositories.SearchRecipeRepositoryImpl
import com.example.recipeapp.features.search.domain.repositories.SearchRecipeRepository
import com.example.recipeapp.preferences.AppPreferences
import com.example.recipeapp.preferences.AppPreferencesImpl

fun dataModule()  = module {

    single<AppPreferences> { AppPreferencesImpl(get()) }

    single<FeedLocalDataSource> { FeedLocalDataSourceImpl(get()) }
    single<FeedRemoteDataSource> { FeedRemoteDataSourceImpl(get()) }

    single<RecipeDetailLocalDataSource> { RecipeDetailLocalDataSourceImpl(get(), get()) }
    single<RecipeDetailRemoteDataSource> { RecipeDetailRemoteDataSourceImpl(get()) }

    single<FavoriteRecipeLocalDataSource> { FavoriteRecipeLocalDataSourceImpl(get()) }

    single<FeedRepository> { FeedRepositoryImpl(get(), get()) }
    single<RecipeDetailRepository> { RecipeDetailRepositoryImpl(get(), get()) }
    single<FavoriteRecipeRepository> { FavoriteRecipeRepositoryImpl(get()) }

    single<SearchRecipeLocalDataSource> { SearchRecipeLocalDataSourceImpl(get()) }
    single<SearchRecipeRepository> { SearchRecipeRepositoryImpl(get()) }
}
