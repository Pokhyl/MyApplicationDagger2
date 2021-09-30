package com.example.myapplicationdagger2

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject


class BlankFragment : Fragment() {
    lateinit @Inject var cat: Cat
    lateinit @Inject var dog: Dog
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_blank, container, false)
        println("$dog ............................................")
        return view
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        (activity as MainActivity).myComponent.inject(this)
        println("$cat ????????????????????????????????????")
    }
}
