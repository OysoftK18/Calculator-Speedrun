package com.example.calculator_speedrun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator_speedrun.ui.theme.CalculatorSpeedrunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorSpeedrunTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun CustomKey(
    modifier: Modifier = Modifier,
    keyValue: String,
    textAlignment: Alignment = Alignment.Center,
    textModifier: Modifier = Modifier
) {
    Card(shape = RoundedCornerShape(10.dp), modifier = modifier.padding(1.dp)) {
        Box(
            modifier = modifier.fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.onSecondaryContainer),
            contentAlignment = textAlignment,
        ) {
            Text(
                text = keyValue,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = textModifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorSpeedrunTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.weight(2.0f)) {
                    CustomKey(
                        keyValue = ".",
                        modifier = Modifier
                            .fillMaxWidth().weight(1.0f),
                        textAlignment = Alignment.CenterEnd,
                        textModifier = Modifier.padding(6.dp)
                    )
                    CustomKey(
                        keyValue = "0.0",
                        modifier = Modifier.fillMaxWidth().weight(2.0f),
                        textAlignment = Alignment.CenterEnd,
                        textModifier = Modifier.padding(6.dp)
                    )
                }
                Row(modifier = Modifier.weight(1.0f)) {
                    CustomKey(keyValue = "7", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "8", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "9", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "*", modifier = Modifier.weight(1.0f))
                }
                Row(modifier = Modifier.weight(1.0f)) {
                    CustomKey(keyValue = "4", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "5", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "6", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "/", modifier = Modifier.weight(1.0f))
                }
                Row(modifier = Modifier.weight(1.0f)) {
                    CustomKey(keyValue = "1", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "2", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "3", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "-", modifier = Modifier.weight(1.0f))
                }
                Row(modifier = Modifier.weight(1.0f)) {
                    CustomKey(keyValue = "0", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = ".", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "=", modifier = Modifier.weight(1.0f))
                    CustomKey(keyValue = "+", modifier = Modifier.weight(1.0f))
                }
            }
        }
    }
}