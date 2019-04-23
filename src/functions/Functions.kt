package functions

import java.util.*

fun main() {
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(17,42))
}

fun helloWorld() =
    println("Hello World!")

fun printWithSpaces(text: String) {
    for (char in text)
        print("$char ")
    println()
}

fun getCurrentDate(): Date = Date()

fun max(a: Int, b: Int): Int {
    if (a >= b) return a

    return b
}