package com.example.petshop

abstract class Mood(var date: String) {
    abstract fun moodType(): String

    fun wHATISTHEDATEOFTHISMOOD(): String {
        return date
    }
}