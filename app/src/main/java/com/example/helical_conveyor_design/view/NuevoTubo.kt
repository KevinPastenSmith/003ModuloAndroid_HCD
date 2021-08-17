package com.example.helical_conveyor_design.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helical_conveyor_design.databinding.ActivityNuevoTuboBinding

class NuevoTubo : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoTuboBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoTuboBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}