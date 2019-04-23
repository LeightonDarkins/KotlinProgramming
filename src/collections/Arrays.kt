package collections

fun main() {
    val array = arrayOf("Texas", "Alabama", "New York") // fixed length
    val mixed = arrayOf("String", 17, 3.0, false) // mixed values
    val numbers = intArrayOf(1,3,3,4,5) // fixed values

    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])

    val string = "Udemy" // Strings are arrays of characters
    println(string[0])

    val states = arrayOf("Idaho", "Iowa")
    val allStates = array + states // array concatenation

    println(allStates.size)

    val empty: Boolean = numbers.isEmpty() // empty check

    if (states.contains("Kentucky")) { // is an item in the array
        println("It's there!")
    } else {
        println("It's not!")
    }
}