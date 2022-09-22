package com.example.probandoandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var botonContraseniaOlvidada: Button
    private lateinit var botonIngresar: Button
    private lateinit var inputEmail: EditText
    private lateinit var inputUser: EditText
    private lateinit var inputPassword: EditText
    private lateinit var ingreseTexto: TextView
    private lateinit var botonVolver: ImageView
    private lateinit var botonAyuda: ImageView
    private lateinit var botonRegistrarme: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ingreseTexto = findViewById(R.id.ingrese)
        botonContraseniaOlvidada = findViewById(R.id.textoLoginOlvidoPassword)
        botonIngresar = findViewById(R.id.botonIniciarSesion)
        inputEmail = findViewById(R.id.inputEmail)
        inputUser = findViewById(R.id.inputUser)
        inputPassword = findViewById(R.id.inputPassword)
        botonVolver = findViewById(R.id.botonVolver)
        botonAyuda = findViewById(R.id.imagenAyuda)
        botonRegistrarme = findViewById(R.id.botonRegistrarse)

        ingreseTexto.visibility = View.GONE

        botonContraseniaOlvidada.setOnClickListener() {

            var correo = ""
            if (inputEmail.text.toString() == "") {
                correo = "pgaido524@alumnos.iua.edu.ar"
            } else {
                correo = inputEmail.text.toString()
            }

            Toast.makeText(baseContext, "Enviamos un correo a $correo", Toast.LENGTH_LONG).show();
        }

        botonIngresar.setOnClickListener() {

            val contraseniaCorrecta = "123"
                if(inputEmail.text.toString() == "")
                    Toast.makeText(baseContext, "Por favor ingrese su Email", Toast.LENGTH_LONG).show();
                else if(inputUser.text.toString() == "")
                    Toast.makeText(baseContext, "Por favor ingrese su Usuario", Toast.LENGTH_LONG).show();
                else if(inputPassword.text.toString() == "")
                    Toast.makeText(baseContext, "Por favor ingrese su Contraseña", Toast.LENGTH_LONG).show();
                else if(inputPassword.text.toString() != contraseniaCorrecta)
                    Toast.makeText(baseContext, "Contraseña incorrecta", Toast.LENGTH_LONG).show();
                else{
                ingreseTexto.visibility = View.VISIBLE
                ingreseTexto.text = "Bienvenido ${inputUser.text}"
            }
        }
        botonVolver.setOnClickListener(){
            if(ingreseTexto.visibility == View.VISIBLE)
                ingreseTexto.visibility = View.GONE
            else{
                onBackPressed()
            }
        }
        botonAyuda.setOnClickListener(){
            Toast.makeText(baseContext, "Debe completar todos los datos para inciar sesion", Toast.LENGTH_LONG).show();
        }
        botonRegistrarme.setOnClickListener(){
            Toast.makeText(baseContext, "Estara disponible proximamente", Toast.LENGTH_LONG).show();
        }
    }
}