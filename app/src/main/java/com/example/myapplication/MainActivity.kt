package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kobieta = findViewById<RadioButton>(R.id.RadioKobieta)
        var wybranaPlec = ""
        if (kobieta.isChecked == true)
        {
            wybranaPlec = "Kobieta"
        }
        else
        {
            wybranaPlec = "Mężczyzna"
        }

        var sport = findViewById<CheckBox>(R.id.checkBoxSport)
        var muzyka = findViewById<CheckBox>(R.id.checkBoxMuzyka)
        var turystyka = findViewById<CheckBox>(R.id.checkBoxTurystyka)
        var gry = findViewById<CheckBox>(R.id.checkBoxGry)
        var wybraneZainteresowania = "Zainteresowania: "

        if (sport.isChecked == true)
        {
            wybraneZainteresowania.plus("Sport ")
        }
        if (muzyka.isChecked == true)
        {
            wybraneZainteresowania.plus("Muzyka ")
        }
        if (turystyka.isChecked == true)
        {
            wybraneZainteresowania.plus("Turystyka ")
        }
        if (gry.isChecked == true)
        {
            wybraneZainteresowania.plus("Gry ")
        }

        var wiek = findViewById<EditText>(R.id.InputWiek).toString()

        findViewById<Button>(R.id.ButtonZakoncz).setOnClickListener {
            findViewById<Button>(R.id.ButtonZakoncz).isActivated = false
            findViewById<TextView>(R.id.Wynik).text = wybranaPlec + " " + wiek + "lat" + wybraneZainteresowania
         }
    }

}