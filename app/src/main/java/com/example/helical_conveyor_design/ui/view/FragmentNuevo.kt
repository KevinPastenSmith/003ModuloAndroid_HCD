package com.example.helical_conveyor_design.ui.view


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.helical_conveyor_design.databinding.FragmentNuevoBinding


class FragmentNuevo : Fragment() {

    private var _binding: FragmentNuevoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNuevoBinding.inflate(inflater, container,false)

        binding.ibtnNuevoproyecto.setOnClickListener {
            val intentNuevoProyecto = Intent(context, NuevoProyecto::class.java)
            startActivity(intentNuevoProyecto)
        }
        binding.ibtnNuevosistemahelicoidal.setOnClickListener {
            val intentNuevoSistemaHelicoidal = Intent(context, NuevoSistemaHelicoidal::class.java)
            startActivity(intentNuevoSistemaHelicoidal)
        }
        binding.ibtnNuevomaterial.setOnClickListener {
            val intentNuevoMaterial = Intent(context, NuevoMaterial::class.java)
            startActivity(intentNuevoMaterial)
        }
        binding.ibtnNuevomotor.setOnClickListener {
            val intentNuevoMotor = Intent(context, NuevoMotorActivity::class.java)
            startActivity(intentNuevoMotor)
        }
        binding.ibtnNuevotransportador.setOnClickListener {
            val intentNuevoTransportador = Intent(context, NuevoTransportador::class.java)
            startActivity(intentNuevoTransportador)
        }
        binding.ibtnNuevahelice.setOnClickListener {
            val intentNuevaHelice = Intent(context, NuevaHelice::class.java)
            startActivity(intentNuevaHelice)
        }
        binding.ibtnNuevotubo.setOnClickListener {
            val intentNuevoTubo = Intent(context, NuevoTubo::class.java)
            startActivity(intentNuevoTubo)
        }


        return binding.root
    }

}