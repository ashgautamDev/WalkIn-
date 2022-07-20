package com.ashish.walkin.components

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.walkin.model.Item

@Composable
fun StaySafeCard(listSafety: List<Item>, onCross: () -> Unit) {


    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colors.primary.copy(alpha = 0.2f),
                shape = RoundedCornerShape(32.dp)
            )
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween , modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "Stay Safe", fontSize = 24.sp, color = MaterialTheme.colors.primary)
            Image(
                imageVector = Icons.Default.Close,
                contentDescription = "",
                modifier = Modifier.clickable { onCross() })

        }
        Spacer(modifier = Modifier.height(4.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween , modifier = Modifier
            .fillMaxWidth()) {
            for (item in listSafety) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Image(
                        painter = painterResource(id = item.itemImage),
                        contentDescription = "",
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = item.itemName,
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.onSurface ,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

    }


}