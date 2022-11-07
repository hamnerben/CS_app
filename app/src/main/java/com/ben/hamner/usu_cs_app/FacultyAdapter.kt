package com.ben.hamner.usu_cs_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ben.hamner.usu_cs_app.databinding.FacultyAdapterBinding

class FacultyAdapter (val faculty: List<Faculty> ):RecyclerView.Adapter<FacultyAdapter.ViewHolder>() {
    class ViewHolder(val binding: FacultyAdapterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FacultyAdapterBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = faculty[position]
        holder.binding.name.text = member.name
        holder.binding.facTitle.text = member.title
        holder.binding.office.text = member.office
    }

    override fun getItemCount(): Int {
        return faculty.size
    }
}