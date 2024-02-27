package com.elvirafatkhutdinova.fruityvice.data

import com.elvirafatkhutdinova.fruityvice.data.model.FruitList
import retrofit2.http.GET

interface FruityViceApi {

    @GET("api/fruit/all")
    suspend fun getFruitList() : FruitList
}