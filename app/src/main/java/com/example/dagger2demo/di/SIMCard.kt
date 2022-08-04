@file:Suppress("PrivatePropertyName")
package com.example.dagger2demo.di

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    private val TAG = SIMCard::class.java.simpleName
    init {
        Log.e(TAG, "SIMCard init block.")
    }

    fun getSimCardDetails() {
        Log.e(
            TAG,
            "SIMCard.getSimCardDetails() with ServiceProvider: ${serviceProvider.getServiceProvider()}"
        )
    }
}