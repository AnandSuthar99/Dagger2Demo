package com.example.dagger2demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2demo.di.SmartPhone
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        DaggerSmartPhoneComponent.create().inject(this)
//        smartPhone.recordVideoCall()

        // When we have a state of a module (memory capacity in MemoryCardModule), we won't have
        // component's create() method instead we have to use .builder().
//        DaggerSmartPhoneComponent
//            .builder()
//            .memoryCardModule(MemoryCardModule(1000))
//            .build()
//            .inject(this)


        // After using application class for smartphoneComponent
        (application as SmartPhoneApp).smartPhoneComponent.inject(this)
    }


}