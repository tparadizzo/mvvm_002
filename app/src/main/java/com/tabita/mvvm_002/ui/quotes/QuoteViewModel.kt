package com.tabita.mvvm_002.ui.quotes

import androidx.lifecycle.ViewModel
import com.tabita.mvvm_002.data.Quote
import com.tabita.mvvm_002.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote (quote: Quote) = quoteRepository.addQuote(quote)
}