package com.example.telasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Cadastro"


        val button4 = findViewById<Button>(R.id.button2)

        button4.setOnClickListener(){
            val intent = Intent(this,TelaPrincipal::class.java)
            startActivity(intent)
        }
    }
}