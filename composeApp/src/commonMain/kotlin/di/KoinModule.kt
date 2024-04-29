package di

import com.russhwolf.settings.Settings
import data.local.MongoImpl
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import domain.CurrencyApiService
import domain.MongoRepository
import domain.PreferencesRepository
import org.koin.core.context.startKoin
import org.koin.dsl.module
import presentation.screen.HomeViewModel

val appModule = module {
    single { Settings() }
    single <MongoRepository> { MongoImpl() }
    single <PreferencesRepository> { PreferencesImpl(settings = get()) }
    single <CurrencyApiService> { CurrencyApiServiceImpl(preferences = get()) }
    factory {
        HomeViewModel(
            preferences = get(),
            mongoDb = get(),
            api = get()
        )
    }
}

fun initializeKoin() {
    startKoin {
        modules(appModule)
    }
}