@file:Suppress("PrivatePropertyName")
package com.example.dagger2demo.di

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    private val TAG = ServiceProvider::class.java.simpleName
    init {
        Log.e(TAG, "ServiceProvider init block.")
    }

    fun getServiceProvider() {
        Log.e(TAG, "ServiceProvider.getServiceProvider()")
    }
}