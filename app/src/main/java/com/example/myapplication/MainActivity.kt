package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kobieta = findViewById<RadioButton>(R.id.RadioKobieta)
        var mezczyzna = findViewById<RadioButton>(R.id.RadioMezczyzna)
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
            wybraneZainteresowania += ("Sport ")
        }
        if (muzyka.isChecked == true)
        {
            wybraneZainteresowania += ("Muzyka ")
        }
        if (turystyka.isChecked == true)
        {
            wybraneZainteresowania += ("Turystyka ")
        }
        if (gry.isChecked == true)
        {
            wybraneZainteresowania += ("Gry ")
        }

        var wiek = findViewById<EditText>(R.id.inputWiek).text

        findViewById<Button>(R.id.ButtonZakoncz).setOnClickListener {
            kobieta.isEnabled = false
            mezczyzna.isEnabled = false
            findViewById<EditText>(R.id.inputWiek).isEnabled == false
            sport.isEnabled = false
            muzyka.isEnabled = false
            turystyka.isEnabled = false
            gry.isEnabled = false

            findViewById<TextView>(R.id.Wynik).text = wybranaPlec + " " + wiek.toString() + "lat" + " " + wybraneZainteresowania
         }
    }

}