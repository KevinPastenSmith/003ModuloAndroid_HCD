package com.example.helical_conveyor_design.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.data.model.Material
import com.example.helical_conveyor_design.databinding.RecyclerMaterialBinding

class MaterialesAdapter (
    private val materiales: List<Material>
        ): RecyclerView.Adapter<MaterialesAdapter.MaterialesViewHolder>() {

    override fun getItemCount() = materiales.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MaterialesViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recycler_material,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MaterialesViewHolder, position: Int) {
        holder.recyclerMaterialBinding.material = materiales[position]
    }

    inner class MaterialesViewHolder(
        val recyclerMaterialBinding: RecyclerMaterialBinding
    ): RecyclerView.ViewHolder(recyclerMaterialBinding.root)

}