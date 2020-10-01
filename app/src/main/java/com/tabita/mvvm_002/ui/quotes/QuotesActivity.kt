package com.tabita.mvvm_002.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tabita.mvvm_002.R

class QuotesActivity {
    class QuotesActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.quotes_activity)
        }
    }
}