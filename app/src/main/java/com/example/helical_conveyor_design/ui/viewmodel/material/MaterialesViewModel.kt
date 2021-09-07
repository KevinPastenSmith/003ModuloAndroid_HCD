package com.example.helical_conveyor_design.ui.viewmodel.material

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.helical_conveyor_design.data.model.material.MaterialModel
import com.example.helical_conveyor_design.data.network.material.MaterialRepository
import com.example.helical_conveyor_design.objets.Coroutines
import kotlinx.coroutines.Job

class MaterialesViewModel(
    private val repository: MaterialRepository
) : ViewModel() {

    private lateinit var job: Job

    private val _materiales = MutableLiveData<List<MaterialModel>>()
    val materiales : LiveData<List<MaterialModel>>
        get() = _materiales

    fun getMateriales(){
       job = Coroutines.ioTheMain(
            { repository.getMateriales() },
            { _materiales.value = it}
        )
    }

    override fun onCleared() {
        super.onCleared()
        if (::job.isInitialized) job.cancel()
    }

}