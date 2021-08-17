package com.example.helical_conveyor_design.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.databinding.ActivityNuevoMotorBinding

class NuevoMotor : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoMotorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoMotorBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}