package oo

fun main() {
    val course = KotlinCourse()

    course.learn()
}

interface Learnable {
    fun learn() {
        println("Learning something...")
    }
}

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course")
    }
}

open class KotlinCourse: Course("Kotlin", 999.99), Learnable {
    final override fun learn() {
        super<Course>.learn()
        super<Learnable>.learn()
        println("I'm one of the first people to learn kotlin!")
    }
}