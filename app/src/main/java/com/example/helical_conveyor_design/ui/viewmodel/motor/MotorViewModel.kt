package com.example.helical_conveyor_design.ui.viewmodel.motor

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.helical_conveyor_design.data.config.motor.MotorApp.Companion.dbMotor
import com.example.helical_conveyor_design.data.model.motor.MotorModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MotorViewModel: ViewModel() {

    val motorList = MutableLiveData<List<MotorModel>>()
    var paremtroBusqueda = MutableLiveData<String>()


    @SuppressLint("NullSafeMutableLiveData")
    fun iniciar (){
        viewModelScope.launch {
            motorList.value = withContext(Dispatchers.IO) {
   /*             dbMotor.motorDao().insert(
                    arrayListOf<MotorModel>(
                        MotorModel(0, "Motor Harina Trigo", "Antihorario", "Superior"),
                        MotorModel(0, "Motor Granos Maiz", "Antihorario", "Inferior"),
                        MotorModel(0, "Motor Carbon Vegetal", "Horario", "Superior"),
                        MotorModel(0, "Motor Cemento", "Horario", "Inferior")
                    ))*/

                    dbMotor.motorDao().getAll()
            }

        }
    }



}