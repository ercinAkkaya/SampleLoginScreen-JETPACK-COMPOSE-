package com.example.loginpage.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Divider(
    text: String = "veya",
    color: Color = Color.White,
    thickness: Float = 1f,
    fontSize: Float = 14f,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()
    ) {
        Divider(
            color = color,
            thickness = thickness.dp,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            color = color,
            fontSize = fontSize.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Divider(
            color = color,
            thickness = thickness.dp,
            modifier = Modifier.weight(1f)
        )
    }
}