package com.example.cronometro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    var chronometer : Chronometer;
    var running : Boolean = true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chronometer = findViewById(R.id.chronometer);
    }

    fun startChronometer( ){
        if(!running){
            chronometer.start();
            running = true;
        }
    }
    fun pauseChronometer( ){
        if(running){
            chronometer.stop();
            running = false;
        }
    }
    fun resetChronometer( ){

    }
}