package com.example.helical_conveyor_design.model


class MaterialModel {

    //Atributos
    private var tipoMezcla: String? = null
    private var opcionMezcla = 0
    private var tipoMaterial: String? = null
    private var abrasividad: String? = null
    private var densidad = 0.0
    private var fluidez: String? = null
    private var clasificacionMaterial: String? = null
    private var opcionClasificacionMaterial = 0
    private var categoriaPeso: String? = null

    constructor() : super() {}

    constructor(
        tipoMezcla: String?,
        opcionMezcla: Int,
        tipoMaterial: String?,
        abrasividad: String?,
        densidad: Double,
        fluidez: String?,
        clasificacionMaterial: String?,
        opcionClasificacionMaterial: Int,
        categoriaPeso: String?
    ) : super() {
        this.tipoMezcla = tipoMezcla
        this.opcionMezcla = opcionMezcla
        this.tipoMaterial = tipoMaterial
        this.abrasividad = abrasividad
        this.densidad = densidad
        this.fluidez = fluidez
        this.clasificacionMaterial = clasificacionMaterial
        this.opcionClasificacionMaterial = opcionClasificacionMaterial
        this.categoriaPeso = categoriaPeso
    }

}

