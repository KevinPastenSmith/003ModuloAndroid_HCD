package com.example.helical_conveyor_design.data.config.motor

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.helical_conveyor_design.dao.MotorDao
import com.example.helical_conveyor_design.data.model.motor.MotorModel


@Database (
    entities = [MotorModel::class],
    version = 1
        )

abstract class MotorDb: RoomDatabase() {
    abstract fun motorDao () : MotorDao

}