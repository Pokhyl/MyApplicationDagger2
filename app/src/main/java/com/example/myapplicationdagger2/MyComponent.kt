package com.example.myapplicationdagger2

import dagger.Component

@Component
interface MyComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment: BlankFragment)
}