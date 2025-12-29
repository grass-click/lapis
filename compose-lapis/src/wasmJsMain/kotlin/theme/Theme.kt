package theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

enum class LapisThemeMode {
    Light, Dark
}

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = DarkGray,
    surface = DarkGray,
    onPrimary = Black,
    onSecondary = Black,
    onBackground = White,
    onSurface = White,
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = White,
    surface = White,
    onPrimary = White,
    onSecondary = Black,
    onBackground = Black,
    onSurface = Black,
)

@Composable
fun LapisTheme(
    mode: LapisThemeMode = LapisThemeMode.Light,
    content: @Composable () -> Unit
) {
    val colors = when (mode) {
        LapisThemeMode.Dark -> DarkColorPalette
        LapisThemeMode.Light -> LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}
