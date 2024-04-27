package di

import com.russhwolf.settings.Settings
import data.local.MongoImpl
import data.local.PreferencesImpl
import data.remote.api.CurrencyApiServiceImpl
import domain.CurrencyApiService
import domain.MongoRepository
import domain.PreferencesRepository
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import presentation.screen.HomeViewModel

val appModule = module {
    single { Settings() }
    single <MongoRepository> { MongoImpl() }
    single <PreferencesRepository> { PreferencesImpl(settings = get()) }
    single <CurrencyApiService> { CurrencyApiServiceImpl(preferences = get()) }
}

val viewModelModule = module {
    factoryOf(::HomeViewModel)
}


fun initializeKoin() {
    startKoin {
        modules(appModule, viewModelModule)
    }
}