package challenges

import kotlin.random.Random

fun main() {
    val random = Random.nextInt(50) + 1

    val result = when (random) {
        in 1..10 -> {
            println("random is between 1 and 10.")
            "random is: $random"
        }
        in 11..20 -> {
            println("random is between 11 and 20.")
            "random is: $random"
        }
        in 21..30 -> {
            println("random is between 21 and 30.")
            "random is: $random"
        }
        in 31..40 -> {
            println("random is between 31 and 40.")
            "random is: $random"
        }
        else -> "random is above 40. random is: $random"
    }

    println(result)
}