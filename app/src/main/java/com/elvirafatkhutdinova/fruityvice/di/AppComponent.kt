package com.elvirafatkhutdinova.fruityvice.di

import com.elvirafatkhutdinova.fruityvice.ui.screen.MainActivity
import dagger.Component

@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}