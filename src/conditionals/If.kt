package conditionals

fun main() {
    val age = 20

    if (age < 18) {
        println("You cannot register.")
    } else if (age < 21) {
        println("Maybe you can register.")
    } else {
        println("You can register.")
    }

    println("The end.")
}