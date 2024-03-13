package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.button)
        add.setOnClickListener {
            val intent = Intent(this,Adding ::class.java )
            startActivity(intent)
        }
        val search = findViewById<Button>(R.id.button3)
        search.setOnClickListener {
            val intent = Intent(this,Search::class.java)
            startActivity(intent)
        }
    }
}