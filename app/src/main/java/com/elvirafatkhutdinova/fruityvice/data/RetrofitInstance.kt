package com.elvirafatkhutdinova.fruityvice.data

import com.elvirafatkhutdinova.fruityvice.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api : FruityViceApi by lazy {
        retrofit.create(FruityViceApi::class.java)
    }
}