package com.example.helical_conveyor_design.data.model.helice

data class HeliceModel(
    val idHelice: Long,
    val nombreHelice: String,
    val diametroHelice: Double,
    val sentidoHelice: String,
    val tipohelice: String,
    val pasoHelice: Double,
    val sentidoGiro: String,
    val velocidadGiro: String,
    val imagenMaterial: String
)