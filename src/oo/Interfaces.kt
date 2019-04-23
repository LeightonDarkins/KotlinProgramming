package oo

fun main() {
    val drivableCar: Drivable = Car("blue")
    drivableCar.drive()

    val motorcycle: Drivable = Motorcycle("Purple")
    motorcycle.drive()

    val buildableCar: Buildable = Car("Red")
    buildableCar.build()

    val car = Car("Green")
    car.drive()
    car.build()
}

interface Drivable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int

    fun build()
}

class Car(val color: String): Drivable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving a $color car...")
    }

    override fun build() {
        println("Building a shiny $color car!")
    }
}

class Motorcycle(val color: String): Drivable {
    override fun drive() {
        println("Driving a $color motorcycle...")
    }
}