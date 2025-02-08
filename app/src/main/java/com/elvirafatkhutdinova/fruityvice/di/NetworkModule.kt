package com.elvirafatkhutdinova.fruityvice.di

import com.elvirafatkhutdinova.fruityvice.data.network.FruityViceApi
import com.elvirafatkhutdinova.fruityvice.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): FruityViceApi {
        return retrofit.create(FruityViceApi::class.java)
    }

}