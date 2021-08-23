package com.example.helical_conveyor_design.data.model

import com.google.gson.annotations.SerializedName


data class MaterialModel (
    @SerializedName("idMaterial") val idMaterial: String,
    @SerializedName("nombreMaterial") val nombreMaterial: String,
    @SerializedName("tipoMezcla") val tipoMezcla: String,
    @SerializedName("tipoMaterial") val tipoMaterial: String,
    @SerializedName("abrasividad") val abrasividad: String,
    @SerializedName("densidad") val densidad: String,
    @SerializedName("fluidez") val fluidez: String,
    @SerializedName("clasificacionMaterial") val clasificacionMaterial: String,
    @SerializedName("categoriaPeso") val categoriaPeso: String,
    @SerializedName("imagenMaterial") val imagenMaterial: String
)


