package com.example.recipeapp.di

import com.example.recipeapp.features.common.data.api.httpClient
import io.ktor.client.HttpClient
import org.koin.dsl.module


fun networkModule() = module {
    single<HttpClient> {
        httpClient
    }

}