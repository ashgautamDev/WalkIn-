package com.ashish.walkin.ui.sceens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ashish.walkin.components.BannerCard
import com.ashish.walkin.components.CategoryCard
import com.ashish.walkin.components.StaySafeCard
import com.ashish.walkin.model.Category
import com.ashish.walkin.model.Item
import com.ashish.walkin.utils.LoadingItem
import com.ashish.walkin.utils.ViewState
import com.ashish.walkin.viewmodel.MainViewModel


@Composable
fun HomeScreen(viewModel: MainViewModel) {

    viewModel.getData()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(bottom = 100.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        BannerCard()
        when (val result = viewModel.categoryState.collectAsState().value) {
            is ViewState.Success -> {

//                Log.d("home", "HomeScreen: ${result.data.categories.listIterator()}")
//                CategoryGrid(list = result.data.categories)
                CategoryGrid(list = Category.fakeCategory)
            }

            is ViewState.Loading -> {
                Log.d("home", "HomeScreen: $result")

                LoadingItem()
            }
            is ViewState.Error -> {
                Column(
                    modifier = Modifier
                        .padding(32.dp)
                        .fillMaxWidth()
                        .background(MaterialTheme.colors.background)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = result.exception.message.toString(),
                        modifier = Modifier.padding(0.dp, 0.dp, 6.dp, 0.dp),
                        color = MaterialTheme.colors.onPrimary,
                        style = MaterialTheme.typography.h6
                    )
                }
            }
            is ViewState.Empty -> {
          CategoryGrid(list = Category.fakeCategory)
        }}

        StaySafeCard(listSafety = Item.staySafeList) {
//                safeCardVisible = !safeCardVisible
        }
    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryGrid(list: List<Category>) {
    LazyVerticalGrid(cells = GridCells.Adaptive(100.dp) , contentPadding = PaddingValues(1.dp)) {
        items(list) { item ->
            CategoryCard(item)
        }
    }

//    LazyColumn {
//        items(list) { item ->
//            CategoryCard(item)
//
//        }
//    }
}