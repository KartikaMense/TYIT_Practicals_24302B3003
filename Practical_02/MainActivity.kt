package com.example.prac6a

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sub = findViewById<Button>(R.id.b1)
        val clr = findViewById<Button>(R.id.b2)
        val txtname = findViewById<EditText>(R.id.edit1)
        val txtpass = findViewById<EditText>(R.id.edit2)
        val txtmail = findViewById<EditText>(R.id.edit3)
        val multitxt = findViewById<TextView>(R.id.edit4)
        sub.setOnClickListener {
            multitxt.setText("\nName:"+txtname.text+"\nPassword:"+txtpass.text+"\nEmail ID:"+txtmail.text)
            Toast.makeText(this,"Submitted", Toast.LENGTH_LONG).show()


        }
        clr.setOnClickListener {
            multitxt.setText("")
            Toast.makeText(this,"Cleared",Toast.LENGTH_LONG).show()
        }

    }
}
