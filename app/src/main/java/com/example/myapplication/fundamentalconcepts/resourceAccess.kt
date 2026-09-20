package com.example.myapplication.fundamentalconcepts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Composable
fun AccessString(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = stringResource(id = R.string.fruit))
    }
}

@Preview(showSystemUi = true)
@Composable
fun AccessStringPreview(){
    AccessString()
}