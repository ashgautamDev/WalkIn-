package com.ashish.walkin.data

import android.provider.ContactsContract
import com.ashish.walkin.model.Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class WalkInRepository @Inject constructor(private val walkInApi: WalkInApi) {
     fun getApiData() : Flow<Data> = flow {
        val response = walkInApi.getApiData()
        emit(response)
    }.flowOn(Dispatchers.IO)
}