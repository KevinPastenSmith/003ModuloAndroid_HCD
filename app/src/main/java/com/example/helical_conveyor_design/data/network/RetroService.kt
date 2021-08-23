package com.example.helical_conveyor_design.data.network

import com.example.helical_conveyor_design.data.model.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("Imagenes")
    suspend fun getDataFromApi(@Query("q" )query : String): RecyclerList
}