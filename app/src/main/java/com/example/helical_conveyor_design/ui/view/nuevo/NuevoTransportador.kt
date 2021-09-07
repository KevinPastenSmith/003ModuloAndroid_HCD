package com.example.helical_conveyor_design.ui.view.nuevo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helical_conveyor_design.databinding.ActivityNuevoTransportadorBinding

class NuevoTransportador : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoTransportadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoTransportadorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}