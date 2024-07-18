package com.example.kotlinhelloworld

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.show();
        val ButtonHot = findViewById<Button>(R.id.btnWarm)
        val ButtonCool = findViewById<Button>(R.id.btnCool)
        val ResetButton= findViewById<Button>(R.id.resetButton)
        ResetButton.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
        ResetButton.setTextColor(ContextCompat.getColor(this,R.color.black))
        val LinearLayOutMain = findViewById<LinearLayout>(R.id.LinearLayoutMain)
            ButtonCool.setBackgroundColor(ContextCompat.getColor(this,R.color.blue))
            ButtonHot.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
        ButtonHot.setOnClickListener{
//            change background color to red or orange
            LinearLayOutMain.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }
        ButtonCool.setOnClickListener{
//             change background color to Blue or sky blue
        LinearLayOutMain.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }
        ResetButton.setOnClickListener{
            LinearLayOutMain.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
        }
    }

}