package challenges

fun main() {
    val book = Book("TDD", "Kent Beck", false)
    book.print()

    book.borrowed()
    book.print()

    book.returned()
    book.print()
}

class Book(val title: String, val author: String, var borrowed: Boolean) {
    fun borrowed() {
        this.borrowed = true
    }

    fun returned() {
        this.borrowed = false
    }

    fun print() {
        println("$title by $author. Borrowed? $borrowed")
    }
}