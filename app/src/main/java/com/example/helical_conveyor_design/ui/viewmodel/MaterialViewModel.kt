package com.example.helical_conveyor_design.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.helical_conveyor_design.data.model.RecyclerList
import com.example.helical_conveyor_design.data.network.RetroInstance
import com.example.helical_conveyor_design.data.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MaterialViewModel:ViewModel() {

    lateinit var recyclerListLiveData : MutableLiveData<RecyclerList>


    init {
        recyclerListLiveData = MutableLiveData()
    }

    fun getRecyclerListObserver(): MutableLiveData<RecyclerList>{
        return recyclerListLiveData
    }

    fun makeApiCall(){
        viewModelScope.launch (Dispatchers.IO){
           val retroInstance =  RetroInstance.getRetroInstance().create(RetroService::class.java)
            val response = retroInstance.getDataFromApi("ny")
            recyclerListLiveData.postValue(response)
        }
    }

}