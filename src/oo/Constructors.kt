package oo

fun main() {
    val person = Person("Jack", 17)

    person.speak()
    person.greet("world")

    println(person.getYearOfBirth())
    println("${person.name} ${person.age}")
}

class Person(val name: String, var age: Int) {
    init {
        println("This is the default constructor behavior")
    }

    fun speak() = println("Hello")
    fun greet(name:String) = println("Hello, $name")
    fun getYearOfBirth() = 2019 - age
}