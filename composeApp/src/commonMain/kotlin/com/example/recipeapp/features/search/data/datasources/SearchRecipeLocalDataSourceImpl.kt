package com.example.recipeapp.features.search.data.datasources

import com.example.recipeapp.features.common.data.database.daos.RecipeDao
import com.example.recipeapp.features.common.domain.entities.RecipeItem


class SearchRecipeLocalDataSourceImpl(
    private val recipeDao: RecipeDao
): SearchRecipeLocalDataSource {
    override suspend fun searchRecipesByText(query: String): List<RecipeItem> {
        return recipeDao.searchRecipesByText(query)
    }
}