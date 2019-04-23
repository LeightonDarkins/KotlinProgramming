package challenges

fun main() {
    var sum = 0L
    for (number in 100..100000L) {
        sum += number
    }
    println(sum)
}