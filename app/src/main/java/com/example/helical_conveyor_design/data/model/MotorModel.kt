package com.example.helical_conveyor_design.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MotorModel(
                      @PrimaryKey(autoGenerate = true)
                      private var id: Int,
                      private var nombreMotor: String,
                      private var sentidoGiroMotor: String,
                      private var posicionMotor: String)