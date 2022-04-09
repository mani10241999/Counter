package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclickme = findViewById<Button>(R.id.butview)
        val tvMyTextView = findViewById<TextView>(R.id.txtview)
        var timeClicked = 0
        btnclickme.setOnClickListener {
            timeClicked = timeClicked + 1

            tvMyTextView.text = timeClicked.toString()
        }




    }
}