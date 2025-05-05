package com.example.recipeapp

import android.app.Application
import com.example.recipeapp.dbFactory.DatabaseFactory
import com.example.recipeapp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


class MainApplication: Application() {

    private val androidModules = module {
        single { DatabaseFactory(applicationContext) }
//        single { MultiplatformSettingsFactory(applicationContext) }
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