package com.example.recipeapp.features.detail.data.datasources

import com.example.recipeapp.features.common.data.api.BASE_URL
import com.example.recipeapp.features.common.data.models.RecipeListApiResponse
import com.example.recipeapp.features.common.data.models.toRecipe
import com.example.recipeapp.features.common.domain.entities.RecipeItem
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.call.body

class RecipeDetailRemoteDataSourceImpl(
    private val httpClient: HttpClient
): RecipeDetailRemoteDataSource {

    override suspend fun getRecipeDetail(id: Long): RecipeItem? {
        val httpResponse = httpClient.get("${BASE_URL}lookup.php?i=$id")
        return httpResponse.body<RecipeListApiResponse>().meals.firstOrNull()?.toRecipe()
    }

}