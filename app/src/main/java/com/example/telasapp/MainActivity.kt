package com.example.telasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.title = "AêMotô!"

        val button = findViewById<Button>(R.id.button8)
        val button2 = findViewById<Button>(R.id.button)

        button.setOnClickListener(){
            val intent = Intent(this,TelaCadastro::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener(){
            val intent = Intent(this,TelaPrincipal::class.java)
            startActivity(intent)

        }

    }

}