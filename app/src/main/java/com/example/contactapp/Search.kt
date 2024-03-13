package com.example.contactapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_layout)

        val searchBtn = findViewById<Button>(R.id.button4)
        searchBtn.setOnClickListener {
            Toast.makeText(this,"Unable to search",Toast.LENGTH_SHORT).show()
        }
    }
}