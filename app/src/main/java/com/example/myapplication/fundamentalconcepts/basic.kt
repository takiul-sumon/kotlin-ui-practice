package com.example.myapplication.fundamentalconcepts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import android.net.wifi.WifiConfiguration.AuthAlgorithm.strings

@Composable
fun Greeting(a: String){
    Text(text = a)
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting("Hello baccho")
}

