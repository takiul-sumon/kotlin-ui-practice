package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.fundamentalconcepts.Greeting
import com.example.myapplication.fundamentalconcepts.GreetingPreview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
Greeting("hello baccho")
            }
        }
    }
}


/*
jetpack compose native android  ui and multiplatform ui using cmp it uses a declarative approach
compose multi platform
powerful animation ui
color schemas state management testing support
unit testing instrumental testing
recomposition is a process to changing the ui...
 mainactivity first launches
 super.onCreate(savedInstanceState
 */

