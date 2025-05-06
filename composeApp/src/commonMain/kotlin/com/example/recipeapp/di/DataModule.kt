package com.example.recipeapp.di

import com.example.recipeapp.features.feed.data.datasources.FeedLocalDataSource
import com.example.recipeapp.features.feed.data.datasources.FeedLocalDataSourceImpl
import com.example.recipeapp.features.feed.data.datasources.FeedRemoteDataSource
import com.example.recipeapp.features.feed.data.datasources.FeedRemoteDataSourceImpl
import org.koin.dsl.module


fun dataModule() = module {
    single<FeedLocalDataSource> { FeedLocalDataSourceImpl(get()) }
    single<FeedRemoteDataSource> { FeedRemoteDataSourceImpl(get()) }


}
