package com.aminulrony.practiceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.aminulrony.practiceapp.ui.theme.PracticeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Column (modifier = Modifier.padding(innerPadding)){
                       Text(text="Welcome to my new android app", color = Color.Blue)
                       Text("Hi, Md Aminul Islam Rony", color = Color.Green)
                   }
                }
            }
        }
    }
}

