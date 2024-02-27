package com.elvirafatkhutdinova.fruityvice.data.model

import com.google.gson.annotations.SerializedName

data class Nutrition(
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