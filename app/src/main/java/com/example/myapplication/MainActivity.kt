package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var counter = 0
        super.onCreate(savedInstanceState) //это конструктор родительского класса, выполняющий необходимые операции для работы активности.
        enableEdgeToEdge() //ne budem trogat eto
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button_counter)
        button.setOnClickListener{textView.text = "${++counter}"}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets -> //ne budem trogat eto
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}