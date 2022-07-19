package com.ashish.walkin.components

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.walkin.model.Item

@Composable
fun StaySafeCard(listSafety : List<Item> , onCross : () -> Unit) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colors.primary.copy(alpha = 0.3f),
                shape = RoundedCornerShape(32.dp)
            )
            .padding(16.dp)
    ) {
        Row (horizontalArrangement = Arrangement.SpaceBetween){
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "Stay Safe", fontSize = 24.sp, color = MaterialTheme.colors.primary)
            Image(imageVector = Icons.Default.Close, contentDescription = "" , modifier = Modifier.clickable { onCross() })

        }
        Row (horizontalArrangement = Arrangement.SpaceBetween){
            for (item in listSafety){
                ItemCard(item = item)
            }
        }

    }


}