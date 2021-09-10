package com.example.helical_conveyor_design.data.config.motor

import android.app.Application
import androidx.room.Room

class MotorApp: Application() {
    companion object{
        lateinit var dbMotor: MotorDb
    }
    override fun onCreate() {
        super.onCreate()
        dbMotor = Room.databaseBuilder(
            this,
            MotorDb::class.java,
            "motor"
        ).build()
    }
}