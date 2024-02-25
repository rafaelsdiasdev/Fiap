package com.fiap.columnrowscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fiap.columnrowscreen.ui.theme.ColumnRowScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnRowScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnRowScreen()
                }
            }
        }
    }
}

@Composable
fun ColumnRowScreen() {
    // Column principal
    Column(
        modifier = Modifier
            .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth().height(300.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 01")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 01")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 01")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 01")
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Green)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 02")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Botão 02")
            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.Yellow)) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(8.dp)
                .background(Color.Red)
                .weight(0.3f)) {
                // Aqui vai o conteúdo
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(8.dp)
                .background(Color.Blue)
                .weight(0.7f)) {
                // Aqui vai o conteúdo
            }
        }
    }
}