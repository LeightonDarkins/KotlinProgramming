package loops

fun main() {
    for (c in "Python") {
        if (c == 'o') break

        println(c)
    }

    val list = listOf("Book", "Table", "Laptop")

    for (string in list) {
        if (!string.contains('o')) {
            continue
        }

        println(string)
    }
}