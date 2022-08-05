package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show the layout file: activity_main
        setContentView(R.layout.activity_main)

        //Display customized to show 'Hello from {name}'
        //1. Add a button to layout

        //Get a reference to button
        //2. Setup logic to know when user tapped button
        findViewById<Button>(R.id.textButton).setOnClickListener {
            //Handles button tap
            //2a. Change color of text
            Log.i("Enel", "Tapped on button")
            //1. Get a reference to the text view
            //2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))


            findViewById<Button>(R.id.backgroundButton).setOnClickListener {
                //Handles button tap
                //3a. Change color of background
                Log.i("Enel", "Tapped on button")

                findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.black))


            }
        }
    }
}


