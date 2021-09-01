package com.guren.jetpackcompose.network

interface EntityMapper <Entity,RealStateModel>{

    fun mapFromEntity(entity: Entity): RealStateModel

    fun mapToEntity(realStateModel: RealStateModel): Entity
}