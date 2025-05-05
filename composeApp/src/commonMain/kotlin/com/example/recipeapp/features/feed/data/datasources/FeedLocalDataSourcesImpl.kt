package com.example.recipeapp.features.feed.data.datasources

import com.example.recipeapp.features.common.data.database.daos.RecipeDao
import com.example.recipeapp.features.common.domain.entities.RecipeItem

class FeedLocalDataSourceImpl(
    private val recipeDao: RecipeDao
): FeedLocalDataSource {
    override suspend fun getRecipesList(): List<RecipeItem> {
        return recipeDao.getAllRecipes()
    }

    override suspend fun saveRecipesList(recipes: List<RecipeItem>) {
        recipeDao.insertRecipesBulk(recipes)
    }
}