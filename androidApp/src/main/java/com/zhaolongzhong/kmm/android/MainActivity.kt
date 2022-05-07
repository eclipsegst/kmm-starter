package com.zhaolongzhong.kmm.android

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import android.os.Bundle
import com.zhaolongzhong.kmm.Greeting

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComposable(text = greet())
        }
    }
}

@Composable
fun MainComposable(text: String) {
    Text("Compose $text")
}
