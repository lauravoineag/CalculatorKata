package com.example.calculatorkata

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculatorkata.ui.theme.CalculatorKataTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Clear(numberPadClickHandler:(String) -> Unit) {
    Card(
        modifier = Modifier.size(width = 50.dp, height = 50.dp),
        onClick = { numberPadClickHandler("AC")}) {
        Box(Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "AC",
                color = Color.Magenta
            )
        }
    }
}
