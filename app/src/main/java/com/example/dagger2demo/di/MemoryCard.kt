@file:Suppress("PrivatePropertyName")

package com.example.dagger2demo.di

import android.util.Log

// Assume that this class is a third party library class and we don't have access to
// modify the class (to add @Inject annotation at the primary constructor.
// In this scenario, we have to create a module "MemoryCardModule" and provide a way to
// create it's object by ourself.)
class MemoryCard {
    private val TAG = MemoryCard::class.java.simpleName

    init {
        Log.e(TAG, "MemoryCard init block.")
    }

    fun getMemoryCardCompany() {
        Log.e(TAG, "MemoryCard.getMemoryCardCompany()")
    }
}