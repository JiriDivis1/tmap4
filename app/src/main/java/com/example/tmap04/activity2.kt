package com.example.tmap04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
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

class activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val name_text : EditText = findViewById(R.id.jmeno_edit)
        val name_data = name_text.text

        val surname_text : EditText = findViewById(R.id.prijmeni_edit)
        val surname_data = surname_text.text
        val birthday_text : EditText = findViewById(R.id.narozeni_edit)
        val birthday_data = birthday_text.text
        val agreement_checkbox : CheckBox = findViewById(R.id.souhlas)
        var agreement_data : String = "Nesouhlasil jsem s podmínkami"
        if (agreement_checkbox.isActivated) {
            agreement_data = "Souhlasil jsem s podmínkami"
        }

        val formBTN : Button = findViewById(R.id.form_button)
        formBTN.setOnClickListener {
            val intent : Intent = Intent(this, activity3::class.java).also {
                it.putExtra("name_data", name_data.toString())
                it.putExtra("surname_data", surname_data.toString())
                it.putExtra("birthday_data", birthday_data.toString())
                it.putExtra("agreement_data", agreement_data.toString())

                startActivity(it)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart2()")
    }

    override fun onResume() {
        super.onResume()
        println("onResume2()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause2()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop2()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy2()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart2()")
    }

}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Tmap04Theme {
        Greeting3("Android")
    }
}