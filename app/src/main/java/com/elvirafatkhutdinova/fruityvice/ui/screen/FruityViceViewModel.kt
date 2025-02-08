package com.elvirafatkhutdinova.fruityvice.ui.screen

import androidx.lifecycle.ViewModel
import com.elvirafatkhutdinova.fruityvice.domain.usecase.GetFruitListUseCase
import javax.inject.Inject

class FruityViceViewModel @Inject constructor(
    private val getFruitListUseCase: GetFruitListUseCase
) : ViewModel() {

}