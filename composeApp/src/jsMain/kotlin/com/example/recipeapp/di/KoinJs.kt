package com.example.recipeapp.di

import com.example.recipeapp.dbFactory.DatabaseFactory
import org.koin.dsl.module
import com.example.recipeapp.preferences.MultiplatformSettingsFactory



val jsModules = module {
    single { DatabaseFactory() }
    single { MultiplatformSettingsFactory() }
}

fun initKoinJs() = initKoin(additionalModules = listOf(jsModules))