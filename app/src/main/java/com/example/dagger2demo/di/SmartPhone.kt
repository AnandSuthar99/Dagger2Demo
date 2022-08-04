@file:Suppress("PrivatePropertyName", "unused")
package com.example.dagger2demo.di

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(
    private val battery: Battery,
    private val memoryCard: MemoryCard,
    private val simCard: SIMCard
) {
    private val TAG = SmartPhone::class.java.simpleName

    init {
        Log.e(TAG, "SmartPhone init block")
    }

    fun recordVideoCall() {
        Log.e(
            TAG, "SmartPhone.recordVideoCall() \n" +
                    "with ${battery.getPercent()} \n" +
                    "and ${memoryCard.getMemoryCardCompany()} \n" +
                    "and ${simCard.getSimCardDetails()}"
        )
    }
}