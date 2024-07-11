package com.example.appoftheday.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.appoftheday.R
import com.example.appoftheday.databinding.FragmentFirstBinding
import com.example.appoftheday.viewmodel.CountViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val viewModel:CountViewModel by activityViewModels ()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //initialization
        //connect xml of fragment with java/kotlin code
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }
    //after fragment/view is created u add logic
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.buttonIncrement.setOnClickListener {
            viewModel.increament()
        }

        viewModel.getCount().observe(viewLifecycleOwner, Observer { incomingValue ->
            // Update the UI.
            binding.textviewFirst.text="Count : "+ incomingValue
        })


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}