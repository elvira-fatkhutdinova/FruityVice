package com.elvirafatkhutdinova.fruityvice.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.elvirafatkhutdinova.fruityvice.data.network.model.FruitResponse
import kotlinx.coroutines.flow.Flow

@Dao
interface FruityDao {
    @Query("SELECT * FROM fruit")
    fun getFruitList() : Flow<List<FruitResponse>>
}