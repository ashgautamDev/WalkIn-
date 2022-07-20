package com.ashish.walkin.data


import com.ashish.walkin.model.Data
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface WalkInApi {
    @GET("/walk_in/public/api/customer_home")
    suspend fun getApiData() : Data

}