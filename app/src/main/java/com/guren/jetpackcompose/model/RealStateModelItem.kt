package com.guren.jetpackcompose.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RealStateModelItem(
    val realstate_id: String,
    val realstate_name: String,
    val realstate_short_desc: String,
    val realstate_address: String,
    val realstate_sqm: String,
    val realstate_price: String,
    val is_deleted: String,
    val thumbnail: String,
    val img_desc: String
): Parcelable


