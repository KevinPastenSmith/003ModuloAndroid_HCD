package com.example.helical_conveyor_design.data.model.motor

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MotorModel(
    @PrimaryKey(autoGenerate = true)
    val idMotor: Long,
    var nombreMotor: String,
    var sentidoGiroMotor: String,
    var posicionMotor: String)