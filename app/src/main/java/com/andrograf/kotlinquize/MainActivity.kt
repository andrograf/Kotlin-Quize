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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun QuizCard(modifier: Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.padding(55.dp)){
        Text(
            text = "Question",
            modifier = modifier
        )
        Text(
            text = "Answer",
            modifier = modifier.blur(15.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Reveal")
        }
    }
}


@Composable
fun MainPage(modifier: Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(55.dp)){
        Text(
            text = stringResource(R.string.title),
            modifier = modifier.padding(20.dp),
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 15.dp)) {
            Text(
                text = "Start",
                modifier = modifier,
                fontSize = 18.sp
            )
        }
    }
}





@Composable
fun Quiz(modifier: Modifier = Modifier) {
    //MainPage(modifier = modifier)
    QuizCard(modifier = modifier)
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