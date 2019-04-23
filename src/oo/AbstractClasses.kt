package oo

fun main() {
    val basePerson = BasePerson("Jim", 23)
    val student = AStudent("Sherry", 16, 1234L)
    val employee = AEmployee("Sheila", 45)

    basePerson.speak()
    student.speak()
    println(student.isIntelligent())
    employee.speak()
    employee.receivePayment()
}

abstract class AbstractPerson(val name: String, var age: Int) {
    abstract fun speak()
}

class AStudent(name: String, age: Int, val studentId: Long): AbstractPerson(name, age) {
    override fun speak() = println("Hi there. I'm $name, I'm $age years old. My student ID is: $studentId")

    fun isIntelligent() = true
}

class AEmployee(name: String, age: Int): AbstractPerson(name, age) {
    override fun speak() = println("Good morning! I'm $name, I'm $age years old.")

    fun receivePayment() = println("Payment received!")
}