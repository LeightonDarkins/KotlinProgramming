package challenges

fun main() {
    val titles = arrayListOf("TDD", "Clean Code", "Refactoring", "Deep Work")

    for (title in titles) {
        if (title.contains('e')) {
            for (character in title) {
                println(character)
            }
        }
    }
}