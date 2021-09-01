package com.guren.jetpackcompose.network

import com.guren.jetpackcompose.model.RealStateModelItem

class RealStateNetworkMapper: EntityMapper<RealStateModelItem,RealStateModelItem> {

    override fun mapFromEntity(entity: RealStateModelItem): RealStateModelItem {
        return RealStateModelItem(
            realstate_id = entity.realstate_id,
            realstate_name = entity.realstate_name,
            realstate_short_desc = entity.realstate_short_desc,
            realstate_address = entity.realstate_address,
            realstate_sqm = entity.realstate_sqm,
            realstate_price = entity.realstate_price,
            is_deleted = entity.is_deleted,
            thumbnail = entity.thumbnail,
            img_desc = entity.img_desc
        )
    }

    override fun mapToEntity(realStateModel: RealStateModelItem): RealStateModelItem {
        return RealStateModelItem(
            realstate_id = realStateModel.realstate_id,
            realstate_name = realStateModel.realstate_name,
            realstate_short_desc = realStateModel.realstate_short_desc,
            realstate_address = realStateModel.realstate_address,
            realstate_sqm = realStateModel.realstate_sqm,
            realstate_price = realStateModel.realstate_price,
            is_deleted = realStateModel.is_deleted,
            thumbnail = realStateModel.thumbnail,
            img_desc = realStateModel.img_desc
        )
    }

    fun fromEntityList(initial:List<RealStateModelItem>) : List<RealStateModelItem>{
        return initial.map { mapFromEntity(it) }
    }

    fun toEntityList(initial: List<RealStateModelItem>) : List<RealStateModelItem>{
        return initial.map { mapFromEntity(it) }
    }
}