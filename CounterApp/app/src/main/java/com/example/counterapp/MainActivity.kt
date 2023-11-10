package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btn)
        val rt: TextView = findViewById(R.id.result_text)

        btn.setOnClickListener() {
            rt.setText("" + increase_Counter())
        }
    }

    fun increase_Counter(): Int {
        counter++
        return counter
    }
}