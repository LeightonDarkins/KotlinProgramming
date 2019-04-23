package oo

fun main() {
    val person = FirstPerson()

    println("Name: ${person.name}, Age: ${person.age}")

    person.name = "Peter"

    println("Name: ${person.name}, Age: ${person.age}")

    person.speak()
    person.greet("Jim")
    println(person.getYearOfBirth())
}

class FirstPerson {
    var name: String = "Sarah" // mutable
    val age: Int = 42 // immutable

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello, $name!")
    }

    fun getYearOfBirth() = 2019 - age
}