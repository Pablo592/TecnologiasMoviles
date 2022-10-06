package com.example.persistence

 data class User (
    val id: Long = 0,
    val name: String? = "No name",
    var profile: String? = null
 )