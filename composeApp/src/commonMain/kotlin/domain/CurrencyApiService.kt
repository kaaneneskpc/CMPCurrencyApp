package domain

import domain.model.Currency
import domain.model.RequestState

interface CurrencyApiService {
    suspend fun getLatestExchangeRate(): RequestState<List<Currency>>
}