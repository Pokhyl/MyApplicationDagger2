package com.example.myapplicationdagger2

import android.app.Application

class MyApplication: Application() {
    var component = DaggerMyComponent.create()
    override fun onCreate() {
        super.onCreate()

    }
}