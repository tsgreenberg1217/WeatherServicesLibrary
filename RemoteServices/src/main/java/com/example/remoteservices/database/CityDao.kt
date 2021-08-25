package com.example.remoteservices.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.remoteservices.database.models.CityWeatherCache


@Dao
interface CityDao {
    @Query("SELECT * FROM cityWeatherCache")
    suspend fun getAll(): List<CityWeatherCache>

    @Insert
    suspend fun insertCity(city: CityWeatherCache)

    @Query("SELECT * FROM cityWeatherCache WHERE name is :name")
    suspend fun getCityByName(name: String): CityWeatherCache?
}
