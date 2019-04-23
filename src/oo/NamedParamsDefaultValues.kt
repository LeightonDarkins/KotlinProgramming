package oo

fun main() {
    House(height = 4.5, color = "Blue", price = 150000).print()
    House(color = "Red", price = 200000, height = 5.0 ).print()
    House(color = "Yellow", height = 2.5).print()
}

class House(val height: Double, val color: String, val price: Int = 50000) {
    fun print() {
        println("House: [height=$height, color=$color, price=$price]")
    }
}