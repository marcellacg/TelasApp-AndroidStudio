package com.example.telasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaManutencao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_manutencao)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Aviso"


        val button5 = findViewById<Button>(R.id.button5)

        button5.setOnClickListener(){
            val intent = Intent(this,TelaPrincipal::class.java)
            startActivity(intent)
        }
    }
}