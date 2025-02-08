package com.elvirafatkhutdinova.fruityvice.domain.repository

import com.elvirafatkhutdinova.fruityvice.domain.model.Fruit
import kotlinx.coroutines.flow.Flow

interface FruitRepository {

    suspend fun getFruitList(): List<Fruit>
}