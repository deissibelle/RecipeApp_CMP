package com.example.recipeapp.features.favorites.data

import com.example.recipeapp.features.common.domain.entities.RecipeItem
import com.example.recipeapp.features.favorites.domain.FavoriteRecipeRepository

class FavoriteRecipeRepositoryImpl(
    private val favoriteRecipeLocalDataSource: FavoriteRecipeLocalDataSource
): FavoriteRecipeRepository {
    override suspend fun getAllFavoriteRecipes(): Result<List<RecipeItem>> {
        return try {
            val list = favoriteRecipeLocalDataSource.getAllFavoriteRecipes()
            return Result.success(list)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    override suspend fun addFavorite(recipeId: Long) {
        favoriteRecipeLocalDataSource.addFavorite(recipeId)
    }
    override suspend fun removeFavorite(recipeId: Long) {
        favoriteRecipeLocalDataSource.removeFavorite(recipeId)
    }
}