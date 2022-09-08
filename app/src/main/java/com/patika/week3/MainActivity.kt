package com.patika.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patika.week3.R.layout
import com.patika.week3.databinding.ActivityMainBinding
import com.patika.week3.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    var number=0


    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding!!.root
        setContentView(view)
       // Log.v("PATIKADEV","onCreate called.")
    }

}