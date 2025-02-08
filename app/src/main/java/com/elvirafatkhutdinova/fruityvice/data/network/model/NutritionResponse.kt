package com.elvirafatkhutdinova.fruityvice.data.network.model

import com.google.gson.annotations.SerializedName

data class NutritionResponse(
    @SerializedName("calories")
    val calories: Int,
    @SerializedName("carbohydrates")
    val carbohydrates: Double,
    @SerializedName("fat")
    val fat: Double,
    @SerializedName("protein")
    val protein: Double,
    @SerializedName("sugar")
    val sugar: Double
)