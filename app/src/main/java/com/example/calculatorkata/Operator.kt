package com.example.calculatorkata

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

enum class Operator(val symbol:String) {
    ADDITION("+"),SUBTRACTION("-"),MULTIPLICATION("x"),DIVISION("/")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Operators(numberPadClickHandler:(String) -> Unit) {
    Column {
        Operator.values().map { operator ->
            Card(
                modifier = Modifier.size(width = 50.dp, height = 50.dp),
                onClick = { numberPadClickHandler(operator.symbol) }) {
                Box(Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = operator.symbol,
                        color = Color.Magenta
                    )
                }
            }
        }
    }
}

