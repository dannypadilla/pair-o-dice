package com.example.pairodice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView // lateinit - promise to sell null value later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        Toast.makeText(this, "New Random Number!", Toast.LENGTH_SHORT).show()
        val randomInt = Random.nextInt(6) + 1
        //val resultViewText: View = findViewById(R.id.result_text)

        //resultViewText.result_text.text = randomInt.toString()

        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        this.diceImage.setImageResource(drawableResource)
    }
}
