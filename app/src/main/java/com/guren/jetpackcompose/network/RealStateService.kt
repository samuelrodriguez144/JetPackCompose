package com.guren.jetpackcompose.network

import com.guren.jetpackcompose.model.RealStateModelItem
import com.guren.jetpackcompose.util.Constants
import retrofit2.http.GET
import retrofit2.http.Header


interface RealStateService {

    @GET(Constants.REALSTATE_LIST)
    suspend fun getRealState(
        @Header("Authorization") token : String
    ): List<RealStateModelItem>

}