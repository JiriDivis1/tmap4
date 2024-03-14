package com.example.tmap04

import android.os.Bundle
import android.widget.TextView
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

class activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)

        val name_data = intent.getStringExtra("name_data")
        val surname_data = intent.getStringExtra("surname_data")
        val birthday_data = intent.getStringExtra("birthday_data")
        val agreement_data = intent.getStringExtra("agreement_data")

        findViewById<TextView>(R.id.jmeno_vystup).apply { text = name_data }
        findViewById<TextView>(R.id.prijmeni_vystup).apply { text = surname_data }
        findViewById<TextView>(R.id.narozeni_vystup).apply { text = birthday_data }
        findViewById<TextView>(R.id.podminky_vystup).apply { text = agreement_data }
    }

    override fun onStart() {
        super.onStart()
        println("onStart3()")
    }

    override fun onResume() {
        super.onResume()
        println("onResume3()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause3()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop3()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy3()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart3()")
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Tmap04Theme {
        Greeting4("Android")
    }
}