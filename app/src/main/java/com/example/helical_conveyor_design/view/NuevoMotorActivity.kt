package com.example.helical_conveyor_design.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityNuevoMotorBinding

class NuevoMotorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoMotorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoMotorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nombreMotorActivity = binding.etNombreMotor.toString()

        var posicionMotorActivity = when (binding.rbPosicionSuperior.isChecked) {
            true -> "Posicion Superior"
            false -> "Posicion Inferior"
        }

        var sentidoGiroMotorActivity = when (binding.rbSentidoGiroHorario.isChecked) {
            true -> "Sentido AntiHorario"
            false -> "Sentido Horario"
        }

        binding.btnCrearMotor.setOnClickListener {

        }

    }

}