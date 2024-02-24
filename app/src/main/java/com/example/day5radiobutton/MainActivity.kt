package com.example.day5radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        button = findViewById(R.id.button)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(
                applicationContext, "On check change: ${radio.text}",
                Toast.LENGTH_SHORT
            ).show()
        }

        button.setOnClickListener {
            val id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) {
                val radio: RadioButton = findViewById(id)
                Toast.makeText(
                    applicationContext, "On button click: ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    applicationContext, "On button click: nothing clicked",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    // Function to handle radio button click
    fun onRadioButtonClick(view: View) {
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        Toast.makeText(
            applicationContext, "On click: ${radio.text}",
            Toast.LENGTH_SHORT
        ).show()
    }
}
