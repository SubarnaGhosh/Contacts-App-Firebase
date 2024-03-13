package com.example.contactapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

lateinit var database : DatabaseReference
class Adding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adding_layout)

        val nameText = findViewById<EditText>(R.id.etName)
        val phoneText = findViewById<EditText>(R.id.etNumber)

        val cancel = findViewById<Button>(R.id.btnCancel)
        val save = findViewById<Button>(R.id.btnSave)

        save.setOnClickListener {
            val name = nameText.text.toString()
            val phone = phoneText.text.toString()

            val user = User(name ,phone)

            database = FirebaseDatabase.getInstance().getReference("Contacts")
            database.child(phone).setValue(user).addOnSuccessListener {
                nameText.text?.clear()
                phoneText.text?.clear()

                Toast.makeText(this,"Contact saved",Toast.LENGTH_SHORT).show()
            }
        }
        cancel.setOnClickListener {
            finish()
        }

    }
}