package com.elvirafatkhutdinova.fruityvice.domain.usecase

import com.elvirafatkhutdinova.fruityvice.domain.repository.FruitRepository
import javax.inject.Inject

class GetFruitListUseCase @Inject constructor(private val repository: FruitRepository) {

   suspend operator fun invoke() = repository.getFruitList()
}