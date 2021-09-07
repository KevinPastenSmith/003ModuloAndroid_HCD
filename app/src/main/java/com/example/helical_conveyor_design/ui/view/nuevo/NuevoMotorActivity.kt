package com.example.helical_conveyor_design.ui.view.nuevo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.helical_conveyor_design.data.config.motor.ConstantesMotor
import com.example.helical_conveyor_design.databinding.ActivityNuevoMotorBinding
import com.example.helical_conveyor_design.ui.view.AdministrarDatos.AdministrarParametros.AdministrarMotores
import com.example.helical_conveyor_design.ui.viewmodel.motor.NuevoMotorViewModel

class NuevoMotorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNuevoMotorBinding
    private lateinit var viewModel: NuevoMotorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevoMotorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get()
        viewModel.operacion = intent.getStringExtra(ConstantesMotor.OPERACION_KEY)!!
        binding.nuevoMotor = viewModel
        binding.lifecycleOwner = this
        
        viewModel.operacionExitosa.observe(this, Observer { 
            if (it){
                mostrarMensaje("Operacion Existosa")
                irAlInicio()
            } else{
                mostrarMensaje("Ocurrio un error")
            }
        })

        var nombreMotorActivity = binding.etNombreMotor.toString()

        var posicionMotorActivity = when (binding.rbPosicionSuperior.isChecked) {
            true -> "Posicion Superior"
            false -> "Posicion Inferior"
        }

        var sentidoGiroMotorActivity = when (binding.rbSentidoGiroHorario.isChecked) {
            true -> "Sentido AntiHorario"
            false -> "Sentido Horario"
        }


    }

    fun mostrarMensaje(s: String) {
        Toast.makeText(applicationContext,s,Toast.LENGTH_LONG).show()
    }
    fun irAlInicio() {
        val intent = Intent(applicationContext, AdministrarMotores::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

}