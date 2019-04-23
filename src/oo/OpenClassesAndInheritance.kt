package oo

fun main() {
    val basePerson = BasePerson("Jim", 23)
    val student = Student("Sherry", 16, 1234L)
    val employee = Employee("Sheila", 45)

    basePerson.speak()
    student.speak()
    println(student.isIntelligent())
    employee.speak()
    employee.receivePayment()
}

open class BasePerson(val name: String, var age: Int) {
    open fun speak() = println("Hello. I'm $name, I'm $age years old.")
}

class Student(name: String, age: Int, val studentId: Long): BasePerson(name, age) {
    override fun speak() = println("Hi there. I'm $name, I'm $age years old. My student ID is: $studentId")

    fun isIntelligent() = true
}

class Employee(name: String, age: Int): BasePerson(name, age) {
    override fun speak() = println("Good morning! I'm $name, I'm $age years old.")

    fun receivePayment() = println("Payment received!")
}