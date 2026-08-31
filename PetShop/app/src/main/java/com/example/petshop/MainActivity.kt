package com.example.petshop


fun main() {
    val cat = Cat("Coco", 6)
    val dog = Dog("Mochi", 6)
    val scorpion = Scorpion("Stinger", 32)

    val pets = mutableListOf<Pet>()
    pets.add(cat)
    pets.add(dog)
    pets.add(scorpion)

    val pettablePets = mutableListOf<Pettable>()
    pettablePets.add(cat)
    pettablePets.add(dog)
    //    pettablePets.add(scorpion) // should raise an error
}



