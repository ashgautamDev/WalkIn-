package com.ashish.walkin.utils

import com.ashish.walkin.model.Category


sealed class ViewState {

    object Empty : ViewState()
    object Loading : ViewState()
    data class Success(val category : List<Category>) : ViewState()
    data class Error(val exception: Throwable) : ViewState()

}