package com.example.myapplicationdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
lateinit @Inject var myComponent: MyComponent
lateinit @Inject var cat: Cat
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("$cat !!!!!!!!!!!!!!!!!!!!!!!!")
    }
}