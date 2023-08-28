package com.example.calculatorkata

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

enum class NumberPad(val number: String) {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), ZERO(
        "0"
    ),
    DOT(".")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberPad(numberPadClickHandler: (String) -> Unit) {
    Column {
        0.until(4).forEach { rowIndex ->
            Row {
                NumberPad.values().filterIndexed { index, _ -> index in rowIndex * 3 ..rowIndex *3 +2}
                    .map { number ->
                        Card(modifier = Modifier.size(width = 50.dp, height = 50.dp),
                            onClick = { numberPadClickHandler(number.number) }) {
                            Box(Modifier.fillMaxSize()) {
                                Text(
                                    modifier = Modifier.align(Center),
                                    text = number.number,
                                    color = Color.Magenta
                                )
                            }
                        }
                    }
            }
        }
    }
}


@Preview(showBackground = false)
@Composable
fun NumberPadPreview() {
    fun numberPadClickHandler(character: String): (String) -> Unit {
        return TODO("Provide the return value")
    }
    NumberPad(numberPadClickHandler(""))
}