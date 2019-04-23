package conditionals

fun main() {
    val mode = 3

    val result = when (mode) {
        1 -> "The mode is lazy."
        2 -> {
            println("The mode is 2.")
            val i = 3
            "It's busy!"
        }
        3 -> "The mode is super productive."
        else -> "I don't know that mode."
    }

    println(result)

    val x = if (mode < 2) {
        println("Mode is less than two")
        17
    } else {
        42
    }

    println(x)
}