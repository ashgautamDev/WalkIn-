package com.ashish.walkin.viewmodel

import androidx.lifecycle.ViewModel
import com.ashish.walkin.data.WalkInRepository
import com.ashish.walkin.utils.ViewState
import androidx.lifecycle.viewModelScope
import com.ashish.walkin.model.Banner
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WalkInRepository) : ViewModel() {

private val _categoryState = MutableStateFlow<ViewState>(ViewState.Loading)
    val categoryState = _categoryState.asStateFlow()

     private lateinit var  _banner : Banner
     val bannerUrl = _banner.image

    init {
        viewModelScope.launch {
            repository.getApiData().collect{data ->
                if (data.categories.isNullOrEmpty()){
                    _categoryState.value = ViewState.Empty
                }
                else {
                    _categoryState.value = ViewState.Success(data.categories)
                }
            }

            repository.getApiData().collect{
                _banner = it.banners[0]
            }

        }
    }


}