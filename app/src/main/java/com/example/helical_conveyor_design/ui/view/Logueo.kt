package com.example.helical_conveyor_design.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.helical_conveyor_design.databinding.ActivityLogueoBinding


class Logueo : AppCompatActivity() {

    private lateinit var binding:ActivityLogueoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogueoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogueoIngresar.setOnClickListener{ ingresarTransaction() }

        binding.btnLogueoCrearcuenta.setOnClickListener { crearCuentaTransaction() }

        binding.btnLogueoInvitado.setOnClickListener { invitadoTransaction() }

    }

    private fun invitadoTransaction() {
        val invitado = Intent(this, Invitado::class.java)
        startActivity(invitado)
    }

    private fun crearCuentaTransaction() {
        val nuevaCuenta = Intent(this, CrearCuenta::class.java)
        startActivity(nuevaCuenta)
    }

    private fun ingresarTransaction() {
        val ingresarIntent = Intent(this, Inicio::class.java)
        startActivity(ingresarIntent)
    }

}