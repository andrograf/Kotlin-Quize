package com.andrograf.kotlinquize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andrograf.kotlinquize.ui.theme.KotlinQuizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinQuizeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quiz()
                }
            }
        }
    }
}

@Composable
fun Quiz(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.padding(25.dp)){
        Text(
            text = "Kotlin Interview Questions",
            modifier = modifier
        )
        Text(
            text = "answer",
            modifier = modifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 15.dp)) {
            Text(text = "Start", modifier = modifier)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun QuizPreview() {
    KotlinQuizeTheme {
        Quiz()
    }
}