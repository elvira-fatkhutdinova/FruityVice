package com.elvirafatkhutdinova.fruityvice.domain.model

data class Fruit(
    val id: Int,
    val family: String,
    val genus: String,
    val name: String,
    val nutrition: Nutrition,
    val order: String
)