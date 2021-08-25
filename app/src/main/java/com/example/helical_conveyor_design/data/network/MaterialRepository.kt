package com.example.helical_conveyor_design.data.network

class MaterialRepository(
    private val api: MaterialesApi
) : SafeApiRequest(){

    suspend fun getMateriales() = apiRequest { api.getMateriales() }
}