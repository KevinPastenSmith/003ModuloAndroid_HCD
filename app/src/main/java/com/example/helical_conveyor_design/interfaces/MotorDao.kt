package com.example.helical_conveyor_design.interfaces

import androidx.room.Dao
import androidx.room.Query
import com.example.helical_conveyor_design.data.model.MotorModel

@Dao
interface MotorDao {

    @Query("SELECT * FROM MotorModel")
    fun getAll(): List<MotorModel>

    @Query("SELECT * FROM MotorModel WHERE id = :id")
    fun getById(id: String):MotorModel

}