package com.example.helical_conveyor_design.ui.viewmodel.motor

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.helical_conveyor_design.data.config.motor.ConstantesMotor
import com.example.helical_conveyor_design.data.config.motor.MotorApp.Companion.dbMotor
import com.example.helical_conveyor_design.data.model.motor.MotorModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NuevoMotorViewModel: ViewModel() {

    var nombreMotorViewModel = MutableLiveData<String>()
    var sentidoGiroMotorViewModel = MutableLiveData<String>()
    var posicionMotorViewModel = MutableLiveData<String>()
    var operacion = ConstantesMotor.OPERACION_INSERTAR
    var operacionExitosa = MutableLiveData<Boolean>()



    fun guardarMotor (){

        var mMotor = MotorModel(0,nombreMotorViewModel.value!!, sentidoGiroMotorViewModel.value!!, posicionMotorViewModel.value!!)
        when(operacion){
            ConstantesMotor.OPERACION_INSERTAR->{
                viewModelScope.launch {
                    val result = withContext(Dispatchers.IO){
                        dbMotor.motorDao().insert(
                            arrayListOf<MotorModel>(
                                    mMotor
                            )
                        )
                    }
                    operacionExitosa.value = result.isNotEmpty()
                }

            }
            ConstantesMotor.OPERACION_EDITAR->{

            }



        }
    }


}