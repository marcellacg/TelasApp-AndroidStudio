package com.example.telasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class TelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Principal"

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener(){
            val intent = Intent(this,TelaRotas::class.java)
            startActivity(intent)
        }

        val button6 = findViewById<Button>(R.id.button6)

        button6.setOnClickListener(){
            val intent = Intent(this,TelaManutencao::class.java)
            startActivity(intent)
        }
    }
}