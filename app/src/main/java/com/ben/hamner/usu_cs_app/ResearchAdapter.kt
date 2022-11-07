package com.ben.hamner.usu_cs_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.Navigator
import androidx.recyclerview.widget.RecyclerView
import com.ben.hamner.usu_cs_app.databinding.FacultyAdapterBinding
import com.ben.hamner.usu_cs_app.databinding.ResearchAdapterBinding

class ResearchAdapter(val researches: MutableList<Research>):RecyclerView.Adapter<ResearchAdapter.ViewHolder>(){
    class ViewHolder(val binding: ResearchAdapterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ResearchAdapterBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val research = researches[position]
        holder.binding.researchName.text = research.name
        holder.binding.description.text = research.description
        holder.binding.facultyEngaged.text = research.facultyEngaged

    }

    override fun getItemCount(): Int {
        return researches.size
    }

}