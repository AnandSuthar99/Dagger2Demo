package com.example.dagger2demo.di

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(private val memoryCapacity: Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        Log.e(
            "MemoryCardModule",
            "MemoryCardModule.providesMemoryCard memoryCapacity: $memoryCapacity"
        )
        return MemoryCard()
    }
}