package com.mastercoding.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Step 2: Declaring Views
        val edt : EditText = findViewById(R.id.edt)
        val btn = findViewById<Button>(R.id.btn)

        // Step 3: Adding functionalities
        btn.setOnClickListener(){
            var entered_text = edt.text

            Toast.makeText(
                this,
            "Hello "+entered_text,
            Toast.LENGTH_LONG)
                .show()
        }



    }
}