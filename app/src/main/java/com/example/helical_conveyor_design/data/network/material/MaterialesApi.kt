package com.example.helical_conveyor_design.data.network.material

import com.example.helical_conveyor_design.data.model.material.MaterialModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MaterialesApi {
    @GET("kevin.json")
    suspend fun getMateriales(): Response<List<MaterialModel>>

    companion object{
        operator fun invoke (): MaterialesApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://kevin.rayunmapu.cl/")
                .build()
                .create(MaterialesApi::class.java)
        }
    }
}