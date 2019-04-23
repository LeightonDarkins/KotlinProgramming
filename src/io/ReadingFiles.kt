package io

import java.io.File

fun main() {
    var lineNumber = 0
    File("src/io/input.txt").forEachLine {
        println(it)
        lineNumber++
    }

    println(lineNumber)
}