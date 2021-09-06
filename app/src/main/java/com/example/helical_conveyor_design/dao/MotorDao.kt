package com.example.helical_conveyor_design.dao

import androidx.room.*
import com.example.helical_conveyor_design.data.model.motor.MotorModel

@Dao
interface MotorDao {

    @Query("SELECT * FROM MotorModel")
     fun getAll(): List<MotorModel>

    @Query("SELECT * FROM MotorModel WHERE idMotor = :id")
    fun getById(id:Long): List<MotorModel>

    @Insert
     fun insert(motores:List<MotorModel>): List<Long>

    @Update
     fun update(motor: MotorModel): Int

    @Delete
     fun delete(motor: MotorModel): Int



}