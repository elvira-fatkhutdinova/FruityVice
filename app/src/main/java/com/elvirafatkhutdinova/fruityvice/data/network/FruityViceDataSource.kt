package com.elvirafatkhutdinova.fruityvice.data.network

import com.elvirafatkhutdinova.fruityvice.data.network.model.FruitList
import javax.inject.Inject

class FruityViceDataSource @Inject constructor(private val apiService: FruityViceApi) {

    suspend fun getFruits(): FruitList {
        val response = apiService.getFruitList()
        return response
    }
}