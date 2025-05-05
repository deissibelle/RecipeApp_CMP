package com.example.recipeapp.di


import com.example.recipeapp.dbFactory.DatabaseFactory
import org.koin.dsl.module


val jvmModules = module {
    single { DatabaseFactory() }

    }


fun initKoinJvm() = initKoin(additionalModules = listOf(jvmModules))