package com.aminulrony.practiceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aminulrony.practiceapp.ui.theme.PracticeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Column (modifier = Modifier.padding(innerPadding)){
                       Text(text="Welcome to my new android app", color = Color.Magenta, fontSize = 20.sp,
                           fontFamily = FontFamily.Monospace,
                           fontStyle = FontStyle.Italic,
                           fontWeight = FontWeight.Bold)
                       Text("Hi, Md Aminul Islam Rony", color = Color.Yellow,
                           modifier = Modifier.background(Color.Green).width(200.dp),
                           textAlign = TextAlign.Center)
                   }
                }
            }
        }
    }
}

