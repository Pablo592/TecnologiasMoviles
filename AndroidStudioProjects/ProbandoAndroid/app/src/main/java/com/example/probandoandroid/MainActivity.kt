package com.example.probandoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        Log.d("CICLO_DE_VIDA","ON_START")
    }
    override fun onResume(){
        super.onResume()
        Log.d("CICLO_DE_VIDA","ON_RESUME")
    }
    override fun onPause(){
        super.onPause()
        Log.d("CICLO_DE_VIDA","ON_PAUSE")
    }
    override fun onStop(){
        super.onStop()
        Log.d("CICLO_DE_VIDA","ON_STOP")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d("CICLO_DE_VIDA","ON_RESTART")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("CICLO_DE_VIDA","ON_DESTROY")
    }
}