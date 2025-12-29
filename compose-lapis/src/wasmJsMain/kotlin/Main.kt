import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import androidx.compose.material.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import theme.LapisTheme
import theme.LapisThemeMode

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
}

@Composable
fun App() {
    var themeMode by remember { mutableStateOf(LapisThemeMode.Light) }

    LapisTheme(mode = themeMode) {
        Surface {
            Column {
                Text("Hello, WASM PWA!")
                Button(onClick = {
                    themeMode = if (themeMode == LapisThemeMode.Light) LapisThemeMode.Dark else LapisThemeMode.Light
                }) {
                    Text("Switch Theme: $themeMode")
                }
            }
        }
    }
}