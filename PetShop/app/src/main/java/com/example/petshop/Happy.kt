package com.example.petshop

class Happy(date : String) : Mood(date) {
    override fun moodType(): String {
        return "Happy"
    }

}