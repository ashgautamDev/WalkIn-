package com.ashish.walkin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ashish.walkin.R
import com.ashish.walkin.ui.theme.WalkInTheme

@Composable
fun BannerCard(bannerUrl: Int? = null) {

    Column(horizontalAlignment = Alignment.CenterHorizontally , modifier = Modifier
        .background(MaterialTheme.colors.background)) {
        Image(
            painter = painterResource(id = bannerUrl ?: R.drawable.banner_png),
            contentDescription = null ,
            modifier = Modifier.background(shape = RoundedCornerShape(32.dp) , color = MaterialTheme.colors.onSecondary)
        ,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Box(modifier = Modifier
                .padding(4.dp)
                .size(8.dp)
                .aspectRatio(1f)
                .border(width = 1.dp, color = MaterialTheme.colors.onSecondary , shape = CircleShape)
            )
            Box(modifier = Modifier
                .padding(4.dp)
                .size(8.dp)
                .aspectRatio(1f)
                .background(MaterialTheme.colors.primary, shape = CircleShape))

            Box(modifier = Modifier
                .padding(4.dp)
                .size(8.dp)
                .aspectRatio(1f)
                .border(width = 1.dp, color = MaterialTheme.colors.onSecondary , shape = CircleShape)
            )
        }

    }
}

@Preview
@Composable
fun BannerPrv() {
    WalkInTheme {
        BannerCard()
    }

}