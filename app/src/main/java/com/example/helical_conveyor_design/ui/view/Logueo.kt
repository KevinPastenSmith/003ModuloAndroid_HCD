package com.example.helical_conveyor_design.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityLogueoBinding


class Logueo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLogueoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with (binding) {
            btnLogueoInvitado.setOnClickListener {
                val invitado = Intent(this@Logueo, Invitado::class.java)
                startActivity(invitado)
            }

            btnLogueoCrearcuenta.setOnClickListener {
                val crearCuenta = Intent(this@Logueo, CrearCuenta::class.java)
                startActivity(crearCuenta)
            }

            btnLogueoIngresar.setOnClickListener {
                val ingresarIntent = Intent(this@Logueo, Inicio::class.java)
                startActivity(ingresarIntent)
            }
        }
    }

/*
    private fun logueoTransaction(clase : ) {
        val logtrans = Intent(this, clase::class.java)
        startActivity(logtrans)
    }
*/

}