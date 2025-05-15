package com.example.recipeapp.di


import com.example.recipeapp.dbFactory.DatabaseFactory
import com.example.recipeapp.preferences.MultiplatformSettingsFactory
import org.koin.dsl.module


val jvmModules = module {
    single { DatabaseFactory() }
    single { MultiplatformSettingsFactory() }

    }


fun initKoinJvm() = initKoin(additionalModules = listOf(jvmModules))