package com.example.calculatorkata

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorkata.ui.theme.CalculatorKataTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutputScreen(calculation: String,result:String) {

    Row {
        TextField(value = calculation, onValueChange = { //TODO
        })
        TextField(value = result, onValueChange = { //TODO
        })
    }
}

@Preview(showBackground = true)
@Composable
fun OutputPreview() {
    CalculatorKataTheme {
        OutputScreen("","0")
    }
}