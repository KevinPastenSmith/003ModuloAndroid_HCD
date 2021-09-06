package com.example.helical_conveyor_design.ui.view.AdministrarDatos.AdministrarParametros

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helical_conveyor_design.Adapters.motores.MotoresAdapter
import com.example.helical_conveyor_design.data.config.motor.ConstantesMotor
import com.example.helical_conveyor_design.databinding.ActivityAdministrarMotoresBinding
import com.example.helical_conveyor_design.ui.view.nuevo.NuevoMotorActivity
import com.example.helical_conveyor_design.ui.viewmodel.motor.MotorViewModel

class AdministrarMotores : AppCompatActivity() {

    lateinit var binding: ActivityAdministrarMotoresBinding
    lateinit var viewModel: MotorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdministrarMotoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO ENLAZAR EL MODELO CON LIVE DATA
        viewModel = ViewModelProvider(this).get()
        viewModel.iniciar()

        binding.recyclerMotor.apply {
            layoutManager = LinearLayoutManager(applicationContext)
        }

        viewModel.motorList.observe(this, {
            binding.recyclerMotor.adapter = MotoresAdapter(it)
        })

        binding.fabAgregarMotor.setOnClickListener {
            val intentAgregarMotor = Intent (this, NuevoMotorActivity::class.java)
            intentAgregarMotor.putExtra(ConstantesMotor.OPERACION_KEY, ConstantesMotor.OPERACION_INSERTAR)
            startActivity(intentAgregarMotor)
        }

    }
}