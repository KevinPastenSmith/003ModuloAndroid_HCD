package com.example.helical_conveyor_design.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {

    companion object{
        val BaseURL = "https://kevin.rayunmapu.cl/"

        fun getRetroInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }
    }
}