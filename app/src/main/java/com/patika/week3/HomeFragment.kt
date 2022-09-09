package com.patika.week3


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.patika.week3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    lateinit var sharedPreferences: SharedPreferences
    private val binding get() = _binding!!
    var number: Int? = 0
    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("FragmentLifecycle onAttach called.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences =
            activity?.getSharedPreferences("com.patika.week3", Context.MODE_PRIVATE)!!
        println("FragmentLifecycle onCreate called.")
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
        val numberPrefences = sharedPreferences.getInt("number", -1)
        number = numberPrefences
        binding.btnPlus.setOnClickListener { plus(view) }
        binding.reset.setOnClickListener { reset(view) }
        println("FragmentLifecycle onViewCreated called.")
    }

    fun plus(view: View) {
        number = number?.plus(1)
        binding.textResult.text = number.toString()
    }

    fun reset(view: View) {

        number = 0
        number?.let { sharedPreferences.edit().putInt("number", it).apply() }
        binding.textResult.text = 0.toString()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        val numberPrefences = sharedPreferences.getInt("number", -1)
        if (numberPrefences == -1) {
            binding.textResult.text = "0"
        } else {
            binding.textResult.text = numberPrefences.toString()
        }
        println("FragmentLifecycle onViewStateRestored called.")
    }

    override fun onStart() {
        super.onStart()
        println("FragmentLifecycle onStart called.")
    }

    override fun onResume() {
        super.onResume()
        println("FragmentLifecycle onResume called.")
    }

    override fun onPause() {
        super.onPause()
        println("FragmentLifecycle onPause called.")
    }

    override fun onStop() {
        super.onStop()
        println("PATIKADE onStop called.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        number?.let { sharedPreferences.edit().putInt("number", it).apply() }
        println("FragmentLifecycle onSaveInstanceState called.")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("FragmentLifecycle onDestroyView called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("FragmentLifecycle onDestroy called.")
    }

    override fun onDetach() {
        super.onDetach()
        println("FragmentLifecycle onDetach called.")
    }


}