package conditionals

fun main() {
    val mode = 5

    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is 2.")
            println("It's busy!")
        }
        3 -> println("The mode is super productive.")
        else -> println("I don't know that mode.")
    }
}