package com.ashish.walkin.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ashish.walkin.model.Category
import com.ashish.walkin.model.Data


sealed class ViewState {

    object Empty : ViewState()
    object Loading : ViewState()
    data class Success(val data : Data ) : ViewState()
    data class Error(val exception: Throwable) : ViewState()

}

@Composable
fun LoadingItem() {
    CircularProgressIndicator(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}