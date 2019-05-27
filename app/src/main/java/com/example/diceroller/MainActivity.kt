package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Use the findViewById() method to get a View reference for the view that you defined in the XML class.
        //In this case, you get the Button reference from the R class and the ID roll_button, and you assign that reference to the rollButton variable.
        val rollButton: Button = findViewById(R.id.roll_button)

        //assign rollDice() as a click handler to the rollButton object
        rollButton.setOnClickListener { rollDice() }


    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1

        //Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }



}
