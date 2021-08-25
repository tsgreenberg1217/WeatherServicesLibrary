package com.example.remoteservices.database

interface WeatherDatabase {
    fun cityDao(): CityDao
}