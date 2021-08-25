package com.example.remoteservices.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.remoteservices.database.models.CityWeatherCache

@Database(entities = [CityWeatherCache::class], version = 1)
@TypeConverters(Converters::class)
abstract class WeatherRoomDatabase : RoomDatabase(), WeatherDatabase

object WeatherDatabaseBuilder {

    fun build(ctx: Context): WeatherRoomDatabase = Room.databaseBuilder(
        ctx, WeatherRoomDatabase::class.java, "weather-database"
    )
        .fallbackToDestructiveMigration()
        .build()
}