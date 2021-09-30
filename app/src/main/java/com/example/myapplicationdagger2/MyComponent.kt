package com.example.myapplicationdagger2

import android.content.Context
import dagger.BindsInstance
import dagger.Component


@Component(modules = [MyModule::class])
interface MyComponent {
    // Factory to create instances of the AppComponent
//    @Component.Factory
//    interface Factory {
//        // With @BindsInstance, the Context passed in will be available in the graph
//        fun create(@BindsInstance context: Context): MyComponent
//    }
    // Types that can be retrieved from the graph
    //fun registrationComponent(): RegistrationComponent.Factory
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment: BlankFragment)
}