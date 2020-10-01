package com.tabita.mvvm_002.utilities


import com.tabita.mvvm_002.data.FakeDatabase
import com.tabita.mvvm_002.data.QuoteRepository
import com.tabita.mvvm_002.ui.quotes.QuotesViewModelFactory



object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository= QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}