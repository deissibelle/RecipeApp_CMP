package com.example.recipeapp.di

import org.koin.dsl.module


val jsModules = module {

}

fun initKoinJs() = initKoin(additionalModules = listOf(jsModules))