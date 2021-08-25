package com.example.helical_conveyor_design.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.helical_conveyor_design.data.network.MaterialRepository

@Suppress("UNCHECKED_CAST")
class MaterialesViewModelFactory (
    private val repository: MaterialRepository
        ) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MaterialesViewModel(repository) as T
    }


}



