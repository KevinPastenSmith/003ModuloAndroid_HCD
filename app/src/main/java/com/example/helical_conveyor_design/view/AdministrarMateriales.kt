package com.example.helical_conveyor_design.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityAdministrarMaterialesBinding

class AdministrarMateriales : AppCompatActivity() {

    private lateinit var binding: ActivityAdministrarMaterialesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarMaterialesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}