package com.example.probandoandroid

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = resources.getText(R.string.MyTitle);
        setContentView(R.layout.activity_main)

        Snackbar.make(findViewById(android.R.id.content), "Soy el snackBar", Snackbar.LENGTH_LONG).show()

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

        Toast.makeText(baseContext, "Soy un toast", Toast.LENGTH_LONG).show();
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