package com.example.remoteservices.database.mappers

import com.example.remoteservices.database.CacheMapper
import com.example.remoteservices.database.models.CityWeatherCache
import com.example.remoteservices.database.models.CityWeatherResult


class DbMapper : CacheMapper<CityWeatherCache, CityWeatherResult> {
    override fun entityToDomain(cache: CityWeatherCache): CityWeatherResult {
        return CityWeatherResult(
            name = cache.name,
            country = cache.country,
            lat = cache.lat,
            lon = cache.lon,
            localTime = cache.localTime,
            obsTime = cache.obsTime,
            icons = cache.icons,
            humidity = cache.humidity,
            feelsLike = cache.feelsLike,
            is_day = cache.is_day,
            desc = cache.desc
        )
    }

    override fun domainToCache(domain: CityWeatherResult): CityWeatherCache {
        return CityWeatherCache(
            name = domain.name,
            country = domain.country,
            lat = domain.lat,
            lon = domain.lon,
            localTime = domain.localTime,
            obsTime = domain.obsTime,
            icons = domain.icons,
            humidity = domain.humidity,
            feelsLike = domain.feelsLike,
            is_day = domain.is_day,
            desc = domain.desc
        )
    }
}