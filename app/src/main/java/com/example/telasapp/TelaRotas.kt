package com.example.telasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaRotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_rotas)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Rotas"
    }
}