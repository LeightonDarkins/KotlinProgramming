package io

fun main() {
    print("Enter a word to guess: ")

    val word = readLine()

    if (word == null) {
        println("No word given. Game over.")
        return
    }

    for (i in 1..100) {
        println()
    }

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var failures = 0

    while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)

        println("#Wrong guesses: $failures\n")

        println("Guess a letter: ")
        val input = readLine()

        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            failures++
        }
    }

    printExploredWord(word, correctGuesses)
    println("#Wrong guesses: $failures\n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }

    println()
}