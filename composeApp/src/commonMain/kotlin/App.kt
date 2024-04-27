import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import com.russhwolf.settings.Settings
import data.local.MongoImpl
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import di.appModule
import di.initializeKoin
import domain.CurrencyApiService
import domain.MongoRepository
import domain.PreferencesRepository
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.koin.dsl.module
import presentation.screen.HomeScreen
import presentation.screen.HomeViewModel
import java.awt.Desktop


@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(HomeScreen())
    }
}