package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        //Use the findViewById() method to get a View reference for the view that you defined in the XML class.
        //In this case, you get the Button reference from the R class and the ID roll_button, and you assign that reference to the rollButton variable.
        val rollButton: Button = findViewById(R.id.roll_button)

        //assign rollDice() as a click handler to the rollButton object
        rollButton.setOnClickListener { rollDice() }


    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }



}
