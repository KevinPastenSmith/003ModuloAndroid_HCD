package com.example.helical_conveyor_design.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.helical_conveyor_design.data.model.MotorModel

class MotorViewModel: ViewModel() {

    private val motorViewModel = MutableLiveData<MotorModel>()


    fun crearMotor (){

        val crearMotorViewModel = MotorModel(id = 0, nombreMotor = "", posicionMotor = "", sentidoGiroMotor = "")
        motorViewModel.postValue(crearMotorViewModel)
    }



}