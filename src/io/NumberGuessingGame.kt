package io

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number between 1 and 100: ")

        input = readLine()

        if (input != null) guess = input.toInt()

        val guessFeedback = when {
            guess < number -> "Too low!"
            guess > number -> "Too high!"
            else -> "You won!"
        }

        println("$guessFeedback Your guess was: $guess.")
    }
}