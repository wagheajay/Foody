package com.ajaywaghe.foody.data

import com.ajaywaghe.foody.data.network.FoodRecipesApi
import com.ajaywaghe.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDateSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi

) {

    //get recipes
    //add suspend because getRecipes function uses suspend function
 suspend fun getRecipes(queries :Map<String,String>):Response<FoodRecipe>
    {
        return foodRecipesApi.getRecipes(queries)
    }
}