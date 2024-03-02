package com.elvirafatkhutdinova.fruityvice.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.elvirafatkhutdinova.fruityvice.data.network.model.Nutrition

@Entity(tableName = "fruit")
data class FruitEntity(
    @ColumnInfo("family")
    val family: String,
    @ColumnInfo("genus")
    val genus: String,
    @ColumnInfo("id")
    val id: Int,
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("nutritions")
    val nutrition: Nutrition,
    @ColumnInfo("order")
    val order: String
)