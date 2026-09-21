package com.example.myapplication.outlinetextfield

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


val rainbowColors = listOf(
    Color.Red,
    Color(0xFFFF7F00), // Orange
    Color.Yellow,
    Color.Green,
    Color.Blue,
    Color(0xFF4B0082), // Indigo
    Color(0xFF8B00FF)  // Violet
)

@Composable
fun OutlinedTextField(){
    var text by remember {
        mutableStateOf("")
    }
    val brasher = remember { rainbowColors }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {OutlinedTextField(value=text, onValueChange = {text=it}, placeholder = { Text("Enter your and name") }) }
}
@Composable
@Preview(showSystemUi = true)
fun OutlinedTextFieldPreview(){
    OutlinedTextField()
}

/*
remember saving function
after even moving to another screen the variable can remember stores the value
* */