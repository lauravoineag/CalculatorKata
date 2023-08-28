package com.example.calculatorkata

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorkata.ui.theme.CalculatorKataTheme

@Composable
fun CustomCalculator() {
    var calculations by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("0") }

    fun checkInput(input: String): List<String> {
        calculations += input
        var numbers = calculations
            .split("+")
            .filter { it.isNotBlank() }
        println(numbers)
        return numbers
    }

    fun numberPadClickHandler(input: String) {
        if (input == "") {
            calculations = input
        }
        var numbers = checkInput(input)

        result = (if (numbers.size >= 2 ) {
            (numbers
                .map { it.toBigDecimal() })
                .sumOf { it }
        } else "bla").toString()
    }

    Column {
        OutputScreen(calculations, result)
        Clear(::numberPadClickHandler)
        Row {
            NumberPad(::numberPadClickHandler)
            Operators(::numberPadClickHandler)

        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Equals(::numberPadClickHandler)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomCalculatorPreview() {
    CalculatorKataTheme {
        CustomCalculator()
    }
}