package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button);
        rollButton.text="Let's Roll"
        imageView=findViewById(R.id.image_view)
        rollButton.setOnClickListener {
            rollDice();
            //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val result:Int= Random.nextInt(6)+1
        val resource_image=when(result){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else ->R.drawable.empty_dice
        }
        imageView.setImageResource(resource_image)
    }
}