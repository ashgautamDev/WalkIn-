package com.ashish.walkin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.walkin.model.Item
import com.ashish.walkin.ui.theme.Shapes

@Composable
fun CategoryCard(item: Item) {
    Card(

        shape = RoundedCornerShape(32.dp),
        modifier = Modifier.background(MaterialTheme.colors.primary),
        elevation = 16.dp,
        backgroundColor = MaterialTheme.colors.surface ,
    ) {
        ItemCard(item)
    }
}

@Composable
fun ItemCard(item: Item) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Image(
            painter = painterResource(id = item.itemImage),
            contentDescription = "",
            modifier = Modifier.size(50.dp)
        )
        Text(text = item.itemName, fontSize = 24.sp, color = MaterialTheme.colors.onSurface)
    }
}

