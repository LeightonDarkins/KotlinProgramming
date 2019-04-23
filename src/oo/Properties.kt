package oo

fun main() {
    val animal = Animal()
    animal.age = 8

    println(animal.age)
    println(animal.name)

    animal.age = -1

    println(animal.age)
}

class Animal {
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    val name: String = "Name"
}