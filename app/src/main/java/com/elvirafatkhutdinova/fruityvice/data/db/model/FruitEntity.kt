package com.elvirafatkhutdinova.fruityvice.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.elvirafatkhutdinova.fruityvice.data.network.model.NutritionResponse

@Entity(tableName = "fruit")
data class FruitEntity(
    @PrimaryKey
    @ColumnInfo("id")
    val id: Int,
    @ColumnInfo("family")
    val family: String,
    @ColumnInfo("genus")
    val genus: String,
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("nutritions")
    val nutritionResponse: NutritionResponse,
    @ColumnInfo("order")
    val order: String
)