package com.ben.hamner.usu_cs_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ben.hamner.usu_cs_app.databinding.FragmentHomeBinding
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.goToResearch.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_researchFragment)
        }
        binding.goToFaculty.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_facultyFragment)
        }
        return binding.root
    }
}