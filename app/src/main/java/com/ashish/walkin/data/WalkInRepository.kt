package com.ashish.walkin.data

import javax.inject.Inject

class WalkInRepository @Inject constructor(private val walkInApi: WalkInApi) {
    suspend fun getApiData()= walkInApi.getApiData()
}