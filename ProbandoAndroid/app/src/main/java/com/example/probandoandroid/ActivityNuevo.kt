package com.example.probandoandroid

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import com.example.utils.shouldChangeWater
import androidx.appcompat.app.AppCompatActivity
import com.example.persistence.User
import com.example.utils.formatPrice

class ActivityNuevo: AppCompatActivity() { //Con AppCompatActivity() indico que es un activity

    private lateinit var textView1 : TextView // "lateinit" quiere decir que tengo una inicializacion tardia,

    override fun onCreate(savedInstanceState: Bundle?) {// Con Bundle? quiere decir que opcionalmente puede haber un estado guardado
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layoutnuevo)
        textView1 = findViewById(R.id.textoview)

        textView1.text = if(shouldChangeWater(day ="Monday", temperature = 20, dirty = 50)){
            "Cambiar agua"
        }else{
            "No cambiar el agua"
        }

        findViewById<TextView>(R.id.textoview2).text = "100".formatPrice()

        val user1 : User = User(id = 12345,name = "Nico",profile = null)

      //  user1.profile = "admin"

        user1.profile?.let {                                     //Con la funcion "let" me aseguro que profile tenga un valor cargado
            it ->
            findViewById<TextView>(R.id.textoview3).text = it    // it representa el valor de profile
        } ?: run {
            findViewById<TextView>(R.id.textoview3).text = "Sin profile"    // Esto es en caso que profile sea nulo
        }

        with(textView1){
            this.text = user1.name
            this.gravity = Gravity.CENTER
            this.textSize = 20F
        }
    }
}