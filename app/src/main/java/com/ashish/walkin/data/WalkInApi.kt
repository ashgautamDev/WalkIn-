package com.ashish.walkin.data

import com.ashish.walkin.model.Banner
import com.ashish.walkin.model.Data
import retrofit2.http.GET

interface WalkInApi {
    @GET("/walk_in/public/api/customer_home")
    suspend fun getBanner() : Data

}