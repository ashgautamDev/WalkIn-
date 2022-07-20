package com.ashish.walkin.viewmodel

import androidx.lifecycle.ViewModel
import com.ashish.walkin.data.WalkInRepository
import com.ashish.walkin.utils.ViewState
import androidx.lifecycle.viewModelScope
import com.ashish.walkin.model.Banner
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WalkInRepository) : ViewModel() {

private val _categoryState = MutableStateFlow<ViewState>(ViewState.Loading)
    val categoryState = _categoryState.asStateFlow()

//     private val  _banner : Banner =
//     val bannerUrl = _banner.image


   fun getData() = viewModelScope.launch {
       _categoryState.value = ViewState.Loading
            repository.getApiData()
                .catch { e->
                    _categoryState.value = ViewState.Error(e)

                }.collect{ data->
                    _categoryState.value = ViewState.Success(data)

                }
//
//            repository.getApiData().collect{
//                _banner = it.banners[0]
//            }

        }



}