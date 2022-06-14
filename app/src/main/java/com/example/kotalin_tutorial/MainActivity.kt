package com.example.kotalin_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton :Button = findViewById (R.id.btn_hyy)
        rollButton.setOnClickListener {
            rollDisc()
        }
    }

    private fun rollDisc() {

        val drawableResours = when (Random().nextInt(6)+1)
        {
            1 ->R.drawable.dice_one
            2 ->R.drawable.dice_two
            3 ->R.drawable.dice_three
            4 ->R.drawable.dice_four
            5 ->R.drawable.dice_five
            else ->R.drawable.dice_six

        }

        val diceImage :ImageView = findViewById(R.id.image_dice)
        diceImage.setImageResource(drawableResours)

        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()



    }
}