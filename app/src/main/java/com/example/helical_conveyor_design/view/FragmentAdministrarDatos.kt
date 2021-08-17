package com.example.helical_conveyor_design.view


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.helical_conveyor_design.databinding.FragmentAdministrarDatosBinding


class FragmentAdministrarDatos : Fragment() {

    private var _binding: FragmentAdministrarDatosBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAdministrarDatosBinding.inflate(inflater, container,false)

        binding.btnAdministrarProyectoActual.setOnClickListener {
            val intentAdministrarProyectoActual = Intent(context, AdministrarProyectoActual::class.java)
            startActivity(intentAdministrarProyectoActual)
        }
        binding.ibtnAdministrarDatosUsuario.setOnClickListener {
            val intentAdministrarDatosUsuario = Intent(context, AdministrarDatosUsuario::class.java)
            startActivity(intentAdministrarDatosUsuario)
        }
        binding.btnAdministrarProyectosGuardados.setOnClickListener {
            val intentAdministrarProyectosGuardados = Intent(context, AdministrarProyectosGuardados::class.java)
            startActivity(intentAdministrarProyectosGuardados)
        }

        return binding.root
    }

}