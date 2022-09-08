package com.patika.week3


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.patika.week3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    lateinit var sharedPreferences: SharedPreferences
    private val binding get() = _binding!!
    var number = 0
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("PATIKADEV", "onAttach called.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences =
            activity?.getSharedPreferences("com.patika.week3", Context.MODE_PRIVATE)!!
        Log.v("PATIKADEV", "onCreate called.")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener { plus(view) }
        binding.reset.setOnClickListener { reset(view) }
        println("PATIKADEV onViewCreated called.")
    }

    fun plus(view: View) {
        number += 1
        binding.textResult.text = number.toString()
    }

    fun reset(view: View) {
        binding.textResult.text = "0"
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        val numberPrefences = sharedPreferences.getInt("number", -1)
        if (numberPrefences == -1) {
            binding.textResult.text = "0"
        } else {
            binding.textResult.text = numberPrefences.toString()
        }
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
        sharedPreferences.edit().putInt("number", number).apply()
        println("PATIKADEV onSaveInstanceState called.")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("PATIKADEV onDestroyView called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("PATIKADEV", "onDestroy called.")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("PATIKADEV", "onDetach called.")
    }


}