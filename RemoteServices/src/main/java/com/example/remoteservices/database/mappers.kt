package com.example.remoteservices.database

interface EntityMapper<Entity, DomainModel> {
    fun entityToDomain(enity: Entity): DomainModel
    fun domainToEntity(domain: DomainModel): Entity?
}

interface CacheMapper<Cache, DomainModel> {
    fun entityToDomain(cache: Cache): DomainModel
    fun domainToCache(domain: DomainModel): Cache
}