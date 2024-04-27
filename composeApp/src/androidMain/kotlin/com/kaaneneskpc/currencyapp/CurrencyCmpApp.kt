package com.kaaneneskpc.currencyapp

import android.app.Application
import di.initializeKoin

class CurrencyCmpApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }
}