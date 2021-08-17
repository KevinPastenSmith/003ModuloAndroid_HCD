package com.example.helical_conveyor_design.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityAdministrarMaterialActualBinding

class AdministrarProyectoActual : AppCompatActivity() {

    private lateinit var binding: ActivityAdministrarMaterialActualBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarMaterialActualBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}