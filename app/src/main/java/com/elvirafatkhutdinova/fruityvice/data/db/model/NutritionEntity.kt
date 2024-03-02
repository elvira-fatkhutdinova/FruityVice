package com.elvirafatkhutdinova.fruityvice.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "nutrition")
data class NutritionEntity(
    @ColumnInfo("calories")
    val calories: Int,
    @ColumnInfo("carbohydrates")
    val carbohydrates: Double,
    @ColumnInfo("fat")
    val fat: Double,
    @ColumnInfo("protein")
    val protein: Double,
    @ColumnInfo("sugar")
    val sugar: Double
)