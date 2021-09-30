package com.example.myapplicationdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject lateinit var myComponent: MyComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}