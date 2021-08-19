package com.example.helical_conveyor_design.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityAdministrarParametrosBinding

class AdministrarParametros : AppCompatActivity() {

    private lateinit var binding: ActivityAdministrarParametrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarParametrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.admini.setOnClickListener {
            val intentAdministrarProyectoActual = Intent(context, AdministrarProyectoActual::class.java)
            startActivity(intentAdministrarProyectoActual)
        }


    }
}