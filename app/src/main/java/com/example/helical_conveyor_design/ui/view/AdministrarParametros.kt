package com.example.helical_conveyor_design.ui.view

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

        binding.ibtnAdministrarMateriales.setOnClickListener {
            val intentAdministrarProyectoActual = Intent(this, AdministrarMateriales::class.java)
            startActivity(intentAdministrarProyectoActual)
        }


    }
}