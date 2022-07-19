package com.ashish.walkin.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFF3A78FE),
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color(0xFFD8D4FF),
    surface = Color(0xFFf9f9f9),
    onPrimary = Color.White,
    onSecondary = Color.Black.copy(.4f),
    onBackground = Color.Black,
    onSurface = Color.Black.copy(.8f)
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF3A78FE),
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color(0xFFD8D4FF),
    surface = Color(0xFFf9f9f9),
    onPrimary = Color.White,
    onSecondary = Color.Black.copy(.4f),
    onBackground = Color.Black,
    onSurface = Color.Black.copy(.8f)
)

@Composable
fun WalkInTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}