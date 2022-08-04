package com.example.dagger2demo.di

// This is an interface, interfaces don't have constructor and so, to inject an interface we need to create a class to provide it's object using dagger.
interface Battery {
    fun getPercent()
}