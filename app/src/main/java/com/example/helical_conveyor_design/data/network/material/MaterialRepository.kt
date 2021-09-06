package com.example.helical_conveyor_design.data.network.material

import com.example.helical_conveyor_design.data.network.SafeApiRequest

class MaterialRepository(
    private val api: MaterialesApi
) : SafeApiRequest(){

    suspend fun getMateriales() = apiRequest { api.getMateriales() }
}