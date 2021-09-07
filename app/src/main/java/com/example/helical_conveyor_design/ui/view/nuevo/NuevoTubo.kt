package com.example.helical_conveyor_design.ui.view.nuevo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityNuevoTuboBinding

class NuevoTubo : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoTuboBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoTuboBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}