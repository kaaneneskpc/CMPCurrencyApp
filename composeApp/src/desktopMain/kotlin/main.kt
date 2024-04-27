import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.initializeKoin

fun main() = application {
    initializeKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "CurrencyApp",
    ) {
        App()
    }
}