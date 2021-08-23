package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityAdministrarDatosUsuarioBinding

class AdministrarDatosUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityAdministrarDatosUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarDatosUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}