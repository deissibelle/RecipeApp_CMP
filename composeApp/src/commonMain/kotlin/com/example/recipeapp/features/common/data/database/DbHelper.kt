package com.example.recipeapp.features.common.data.database

import com.example.recipeapp.RecipeAppDb
import com.example.recipeapp.dbFactory.DatabaseFactory
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class DbHelper (
    private val driverFactory: DatabaseFactory
){
    private var db: RecipeAppDb? = null
    private val mutex = Mutex()


    suspend fun <Result: Any> withDatabase(block: suspend(RecipeAppDb)->Result) = mutex.withLock{
        if (db==null){
            db = createDb(
                driverFactory
            )
        }
        return@withLock block(db!!)
    }
    private suspend fun createDb(driverFactory: DatabaseFactory): RecipeAppDb{
        return RecipeAppDb(
            driver = driverFactory.createDriver(),
            RecipeAdapter = TODO()
        )
    }
}