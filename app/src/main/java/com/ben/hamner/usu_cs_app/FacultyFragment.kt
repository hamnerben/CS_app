package com.ben.hamner.usu_cs_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ben.hamner.usu_cs_app.databinding.FragmentFacultyBinding

data class Faculty(
    val name: String,
    val title: String,
    val office: String
)


class FacultyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFacultyBinding.inflate(inflater, container, false)

        val faculty1 = Faculty("Mahdi Nasrullah Al-Ameen", "Assistant Professor", "Office Location: Old Main 401F")
        val faculty2 = Faculty("Vicki Allan", "Associate Professor", "Office Location: Old Main 429")
        val faculty3 = Faculty("Soukaina Filali Boubrahimi", "Assistant Professor", "Office Location: Old Main 401A")
        val faculty4 = Faculty("Heng-Da Cheng", "Professor", "Office Location: Old Main 401B")
        val faculty5 = Faculty("Isaac Cho", "Assistant Professor", "Office Location: Old Main 402G")
        val faculty6 = Faculty("Stephen Clyde", "Emeritus Associate Professor", "Office Location: Old Main 418")
        val faculty7 = Faculty("Joseph Ditton", "Professional Practice Assistant Professor", "Office Location: Old Main 420")
        val faculty8 = Faculty("Curtis Dyreson", "Professor", "Office Location: Old Main 402A")
        val faculty9 = Faculty("John Edwards", "Assistant Professor", "Office Location: Old Main 401D")
        val faculty10 = Faculty("Erik Falor", "Professional Practice Associate Professor", "Office Location: Old Main 418A")

        val faculty = mutableListOf<Faculty>(faculty1, faculty2, faculty3, faculty4, faculty5, faculty6, faculty7, faculty8, faculty9, faculty10)

        binding.facultyRecycler.adapter = FacultyAdapter(faculty)
        binding.facultyRecycler.layoutManager = LinearLayoutManager(context)

        return binding.root
    }
}