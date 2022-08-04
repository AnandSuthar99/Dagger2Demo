package com.example.dagger2demo

import android.app.Application
import com.example.dagger2demo.di.DaggerSmartPhoneComponent
import com.example.dagger2demo.di.MemoryCardModule
import com.example.dagger2demo.di.SmartPhoneComponent

class SmartPhoneApp: Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        super.onCreate()
        smartPhoneComponent = initDagger()
    }

    private fun initDagger() = DaggerSmartPhoneComponent
        .builder()
        .memoryCardModule(MemoryCardModule(1000))
        .build()
}