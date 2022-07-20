package com.ashish.walkin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import com.ashish.walkin.R
import com.ashish.walkin.model.Category
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun CategoryCard(category: Category) {
    Card(

        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(8.dp),
        elevation = 16.dp,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        ItemCard(category)
    }
}

@Composable
fun ItemCard(category: Category, modifier: Modifier = Modifier, textSize: TextUnit = 18.sp) {
    val context = LocalContext.current
    val painter = rememberCoilPainter(
        request = category.icon,
        imageLoader = ImageLoader.invoke(context)
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Image(
            painter = painter ?: painterResource(id = R.drawable.home_active),
            contentDescription = "",
            modifier = modifier.size(50.dp)
        )
        category.name?.let {
            Text(
                text = it,
                fontSize = textSize,
                color = MaterialTheme.colors.onSurface
            )
        }
    }
}



