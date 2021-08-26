package com.example.helical_conveyor_design.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.helical_conveyor_design.data.model.Material
import com.example.helical_conveyor_design.data.network.MaterialRepository
import com.example.helical_conveyor_design.objets.Coroutines
import kotlinx.coroutines.Job

class MaterialesViewModel(
    private val repository: MaterialRepository
) : ViewModel() {

    private lateinit var job: Job

    private val _materiales = MutableLiveData<List<Material>>()
    val materiales : LiveData<List<Material>>
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