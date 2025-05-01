package com.example.recipeapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import  com.example.recipeapp.di.initKoin

class MainApplication: Application() {

    private val androidModules = module {

    }

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        initKoin(additionalModules = listOf(androidModules)) {
            androidContext(applicationContext)
        }
    }
}