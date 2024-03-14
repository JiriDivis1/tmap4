package com.example.tmap04

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tmap04.ui.theme.Tmap04Theme

class activity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        val activity2_button : Button = findViewById(R.id.activity2_button)
        activity2_button.setOnClickListener {
            val intent : Intent = Intent(this, activity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart1()")
    }

    override fun onResume() {
        super.onResume()
        println("onResume1()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause1()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop1()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy1()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart1()")
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Tmap04Theme {
        Greeting2("Android")
    }
}