package com.patika.week3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class HomeFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("PATIKADEV","onAttach called.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("PATIKADEV","onCreate called.")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("PATIKADEV","onCreateView called.")
        return inflater.inflate(R.layout.fragment_home,
            container,
            false
        )

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("PATIKADEV onViewCreated called.")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("PATIKADEV onViewStateRestored called.")
    }

    override fun onStart() {
        super.onStart()
        println("PATIKADEV onStart called.")
    }

    override fun onResume() {
        super.onResume()
        println("PATIKADEV onResume called.")
    }

    override fun onPause() {
        super.onPause()
        println("PATIKADEV onPause called.")
    }

    override fun onStop() {
        super.onStop()
        println("PATIKADE onStop called.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("PATIKADEV onSaveInstanceState called.")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("PATIKADEV onDestroyView called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("PATIKADEV","onDestroy called.")
    }

    override fun onDetach() {
        super.onDetach()
        println("PATIKADEV onDetach called.")
    }



}