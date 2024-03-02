package com.elvirafatkhutdinova.fruityvice.data.network

import com.elvirafatkhutdinova.fruityvice.data.network.model.FruitList
import retrofit2.http.GET

interface FruityViceApi {

    @GET("api/fruit/all")
    suspend fun getFruitList() : FruitList
}