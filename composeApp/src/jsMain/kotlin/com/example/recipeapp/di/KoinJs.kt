package com.example.recipeapp.di

import com.example.recipeapp.dbFactory.DatabaseFactory
import org.koin.dsl.module


val jsModules = module {
    single { DatabaseFactory() }

}

fun initKoinJs() = initKoin(additionalModules = listOf(jsModules))