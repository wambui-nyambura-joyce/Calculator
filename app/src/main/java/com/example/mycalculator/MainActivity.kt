package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addNumbers(){
        var tvnumber1 = findViewById<EditText>(R.id.Number1)
        var tvnumber2 = findViewById<EditText>(R.id.Number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var output1 = tvnumber1.text.toString().toInt()
            var output2 = tvnumber2.text.toString().toInt()
            var result = output1 + output2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
    fun division(){
        var tvnumber1 = findViewById<EditText>(R.id.Number1)
        var tvnumber2 = findViewById<EditText>(R.id.Number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var output1 = tvnumber1.text.toString().toInt()
            var output2 = tvnumber2.text.toString().toInt()
            var result = output1 + output2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
    fun subtraction(){
        var tvnumber1 = findViewById<EditText>(R.id.Number1)
        var tvnumber2 = findViewById<EditText>(R.id.Number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var output1 = tvnumber1.text.toString().toInt()
            var output2 = tvnumber2.text.toString().toInt()
            var result = output1 + output2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
}