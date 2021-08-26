package com.example.helical_conveyor_design.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.helical_conveyor_design.R
import com.example.helical_conveyor_design.ui.viewmodel.MaterialesViewModel

class AdministrarMateriales : AppCompatActivity() {


    private val materialViewModel: MaterialesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrar_materiales)


    }

}