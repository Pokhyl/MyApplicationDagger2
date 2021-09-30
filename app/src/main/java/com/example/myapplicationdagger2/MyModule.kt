package com.example.myapplicationdagger2

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun createDog(): Dog{
        return Dog("bobic", 5 )
    }
}