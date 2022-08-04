package com.example.dagger2demo.di

import com.example.dagger2demo.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
    fun inject(mainActivity: MainActivity)
}