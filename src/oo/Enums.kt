package oo

fun main() {
    println("${Color.RED.name} ${Color.RED.ordinal}")

    println("${Color.BLUE.name} ${Color.BLUE.ordinal}")

    println("${Color.GREEN.name} ${Color.GREEN.ordinal}")
}

enum class Color { RED, BLUE, GREEN }