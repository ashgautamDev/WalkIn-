package com.ashish.walkin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.walkin.R
import com.ashish.walkin.ui.theme.WalkInTheme
import java.util.*

@Composable
fun TopBar(location : String = "Noida") {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween ,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background).
                padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Bottom
            ) {
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "" , tint = MaterialTheme.colors.primary, modifier = Modifier
                    .size(24.dp))
            Text(text = location.toUpperCase(Locale.ROOT), fontSize = 12.sp , color = MaterialTheme.colors.primary)
        }
        
        Image(painter = painterResource(id = R.drawable.main_logo), contentDescription ="" ,
         modifier = Modifier
             .size(100.dp))

        Row(
            verticalAlignment = Alignment.Bottom
        ) {
            Image(painter = painterResource(id = R.drawable.ic_search), contentDescription ="" , modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Image(painter = painterResource(id = R.drawable.ic_notification), contentDescription ="",modifier = Modifier.size(24.dp ))

        }
    }
}

@Preview
@Composable
fun TopAppBarPrev() {
    WalkInTheme {
        TopBar()

    }

}