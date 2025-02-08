package com.elvirafatkhutdinova.fruityvice.data.repository

import com.elvirafatkhutdinova.fruityvice.data.network.FruityViceDataSource
import com.elvirafatkhutdinova.fruityvice.data.network.model.FruitResponse
import com.elvirafatkhutdinova.fruityvice.data.network.model.NutritionResponse
import com.elvirafatkhutdinova.fruityvice.domain.model.Fruit
import com.elvirafatkhutdinova.fruityvice.domain.model.Nutrition
import com.elvirafatkhutdinova.fruityvice.domain.repository.FruitRepository
import javax.inject.Inject

class FruitRepositoryImpl @Inject constructor(private val dataSource: FruityViceDataSource): FruitRepository {
    override suspend fun getFruitList(): List<Fruit> {
        return dataSource.getFruits().fruitResponseList.map { it.toDomain() }
    }
}

fun FruitResponse.toDomain(): Fruit {
    return Fruit(
        family = this.family,
        genus = this.genus,
        id = this.id,
        name = this.name,
        order = this.order,
        nutrition = this.nutritionResponse.toDomain()
    )
}

fun NutritionResponse.toDomain(): Nutrition {
    return Nutrition(
        calories = this.calories,
        carbohydrates = this.carbohydrates,
        fat = this.fat,
        protein = this.protein,
        sugar = this.sugar
    )
}