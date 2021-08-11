package com.example.helical_conveyor_design.model

class MotorModel {
    //Metodos Getters y Setters
    //Atributos
    private var sentidoGiroMotor : String? = null
    private var opcionSentidoGiroMotor = 0
    private var posicionMotor : String? = null
    private var opcionPosicionMotor = 0

    //Metodo Constructor

    constructor(
        sentidoGiroMotor: String?,
        opcionSentidoGiroMotor: Int,
        posicionMotor: String?,
        opcionPosicionMotor: Int
    ) : super() {
        this.sentidoGiroMotor = sentidoGiroMotor
        this.opcionSentidoGiroMotor = opcionSentidoGiroMotor
        this.posicionMotor = posicionMotor
        this.opcionPosicionMotor = opcionPosicionMotor
    }

    constructor() : super() {}

}