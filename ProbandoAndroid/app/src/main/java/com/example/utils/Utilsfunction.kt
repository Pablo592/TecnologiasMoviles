package com.example.utils

fun shouldChangeWater(day: String, temperature: Int, dirty: Int = 20):Boolean { //Parametros de la funcion
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

//Extension function
fun String.formatPrice() = "$ $this.00"