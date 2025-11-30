package com.example.lunchtray

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lunchtray.ui.theme.LunchtrayTheme // Menggunakan 'LunchtrayTheme' dengan 't' kecil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LunchtrayTheme { // Menggunakan 'LunchtrayTheme' dengan 't' kecil
                LunchTrayApp()
            }
        }
    }
}