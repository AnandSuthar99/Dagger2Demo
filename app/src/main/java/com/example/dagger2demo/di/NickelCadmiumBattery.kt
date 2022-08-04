@file:Suppress("PrivatePropertyName")

package com.example.dagger2demo.di

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor() : Battery {
    private val TAG = NickelCadmiumBattery::class.java.simpleName
    init {
        Log.e(TAG, "NickelCadmiumBattery init block.")
    }

    override fun getPercent() {
        Log.e("TAG", "NickelCadmiumBattery.getPercent")
    }
}