package com.example.worldskills2070

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldskills2070.ui.theme.WorldSkills2070Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            StatefulCounter()
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}

data class CounterState(
    val number: Int = 0
)

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
//        val counter = remember {
//            mutableStateOf(CounterState(0))
//        }
        var counter by remember {
            mutableStateOf(CounterState(0))
        }
        Text(
            text = counter.number.toString(),
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {
                counter = counter.copy(number = counter.number + 1)
            }
        ) {
            Text(text = "Добавить", fontSize = 18.sp)
        }
    }
}

@Composable
fun Test(modifier: Modifier = Modifier) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly
//    ) {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Hello World",
            fontSize = 35.sp,
            color = Color.Red,
            modifier = Modifier
                .background(Color.Yellow, RoundedCornerShape(20.dp))
                .padding(10.dp)
                .background(Color.Green)
        )
        Text(
            text = "Welcome",
            fontSize = 35.sp,
            color = Color.Blue,
            modifier = Modifier
                .background(Color.Gray, RoundedCornerShape(20.dp))
                .padding(10.dp)
                .background(Color.Green)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MainActivityPreview() {
    Test()
}
