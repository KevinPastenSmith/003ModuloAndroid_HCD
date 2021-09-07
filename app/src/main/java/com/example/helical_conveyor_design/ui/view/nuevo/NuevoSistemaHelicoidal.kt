package com.example.helical_conveyor_design.ui.view.nuevo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helical_conveyor_design.databinding.ActivityNuevoSistemaHelicoidalBinding

class NuevoSistemaHelicoidal : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoSistemaHelicoidalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoSistemaHelicoidalBinding.inflate(layoutInflater)
        setContentView(binding.root)






    }
}