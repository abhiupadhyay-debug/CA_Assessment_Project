package com.example.ca_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val radioButton = findViewById<RadioButton>(R.id.radio_1)

        val radioButton2 = findViewById<RadioButton>(R.id.radio_2)

        val radioButton3 = findViewById<RadioButton>(R.id.radio_3)

        val checkBox = findViewById<CheckBox>(R.id.selected_1)

        val checkBox2 = findViewById<CheckBox>(R.id.selected_2)

        val checkBox3 = findViewById<CheckBox>(R.id.selected_3)

        val button = findViewById<Button>(R.id.button)

        checkBox.setOnClickListener(){
            Toast.makeText(this,"Selected Check Box is : " + checkBox.text , Toast.LENGTH_SHORT).show();
        }
        checkBox2.setOnClickListener(){
            Toast.makeText(this,"Selected Check Box is : " + checkBox2.text , Toast.LENGTH_SHORT).show();
        }
        checkBox3.setOnClickListener(){
            Toast.makeText(this,"Selected Check Box is : " + checkBox3.text , Toast.LENGTH_SHORT).show();
        }
        radioButton.setOnClickListener(){
            Toast.makeText(this,"Selected Radio Button : "+ radioButton.text, Toast.LENGTH_SHORT).show();
        }
        radioButton2.setOnClickListener(){
            Toast.makeText(this,"Selected Radio Button : "+ radioButton2.text, Toast.LENGTH_SHORT).show();
        }
        radioButton3.setOnClickListener(){
            Toast.makeText(this,"Selected Radio Button : "+ radioButton3.text, Toast.LENGTH_SHORT).show();
        }
        button.setOnClickListener(){
            Toast.makeText(this,"Filled By : "+ button.text, Toast.LENGTH_SHORT).show();
        }
    }
}