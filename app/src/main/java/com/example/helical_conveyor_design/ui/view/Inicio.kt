package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {

    private var fragmentInicioNuevo: FragmentNuevo? = FragmentNuevo()
    private var fragmentInicioAdministrarDatos: FragmentAdministrarDatos? = FragmentAdministrarDatos()
    private var fragmentInicioProyectosComunidad: FragmentProyectosComunidad? = FragmentProyectosComunidad()

    private lateinit var binding: ActivityInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.framelayout_Inicio, fragmentInicioNuevo!!).commit()

        binding.btnInicioNuevo.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout_Inicio, fragmentInicioNuevo!!).commit()
        }
        binding.btnInicioAdministrarDatos.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout_Inicio, fragmentInicioAdministrarDatos!!).commit()
        }
        binding.btnInicioProyectosComunidad.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout_Inicio, fragmentInicioProyectosComunidad!!).commit()
        }

    }

}