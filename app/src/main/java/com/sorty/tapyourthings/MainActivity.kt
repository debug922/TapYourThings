package com.sorty.tapyourthings

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text= findViewById<TextView>(R.id.display);
        val tap= findViewById<Button>(R.id.tap);
        var count : Int =0;

        tap.setOnClickListener{
            count++
            text.text="count=$count";
            Toast.makeText(this@MainActivity, "$count", Toast.LENGTH_LONG).show();
        }



    }
}
