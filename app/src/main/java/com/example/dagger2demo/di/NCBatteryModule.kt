@file:Suppress("unused")

package com.example.dagger2demo.di

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {

    // We have already annotated NickelCadmiumBattery constructor with @Inject annotation
    // so we can consider this module (NCBatteryModule) as an abstract module and so
    // In dagger abstract functions are not annotated with @Provides annotation so we need to use @Binds annotation.
    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery
}