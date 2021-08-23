package com.example.helical_conveyor_design.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.data.model.RecyclerData
import com.squareup.picasso.Picasso


class MaterialesRecyclerViewAdapter: RecyclerView.Adapter<MaterialesRecyclerViewAdapter.MyViewHolder>(){

    var items = ArrayList<RecyclerData>()

    fun setUpdateData(items : ArrayList<RecyclerData>){
        this.items = items
        notifyDataSetChanged()
    }

    class MyViewHolder(view:View): RecyclerView.ViewHolder(view){

        val imagenMaterial = view.findViewById<ImageView>(R.id.iv_recyclerListRow)
        val nombreMaterial = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_nombreMaterial)
        val idMaterial = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_id)
        val tipoMezcla = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_tipoMezcla)
        val tipoMaterial = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_tipoMaterial)
        val abrasividad = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_abrasividad)
        val densidad = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_densidad)
        val fluidez = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_fluidez)
        val clasificacionMaterial = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_clasificacionMaterial)
        val categoriaPeso = view.findViewById<TextView>(R.id.tv_recycyclerAdministrarMateriales_categoriaPeso)


        fun bind(data: RecyclerData){
            nombreMaterial.text = data.nombreMaterial
            idMaterial.text = data.idMaterial
            tipoMezcla.text = data.tipoMezcla
            tipoMaterial.text = data.tipoMaterial
            abrasividad.text = data.abrasividad
            densidad.text = data.densidad
            fluidez.text = data.fluidez
            clasificacionMaterial.text = data.clasificacionMaterial
            categoriaPeso.text = data.categoriaPeso

            val url = data.imagenMaterial

            Picasso.get()
                .load(url)
                .into(imagenMaterial)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }

}