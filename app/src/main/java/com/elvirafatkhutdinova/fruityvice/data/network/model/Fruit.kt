package com.elvirafatkhutdinova.fruityvice.data.network.model

import com.google.gson.annotations.SerializedName

data class Fruit(
    @SerializedName("family")
    val family: String,
    @SerializedName("genus")
    val genus: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nutritions")
    val nutrition: Nutrition,
    @SerializedName("order")
    val order: String
)