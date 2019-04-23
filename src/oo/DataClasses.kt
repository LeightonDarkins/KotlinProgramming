package oo

fun main() {
    val basicBook = BasicBook("Basic Book", "Kent Beck", 2000, 99.99)
    val basicBook2 = BasicBook("Basic Book", "Kent Beck", 2000, 99.99)

    val dataBook = DataBook("Data Book", "Kent Beck", 2000, 99.99)
    val dataBook2 = DataBook("Data Book", "Kent Beck", 2000, 99.99)
    val dataBook3 = dataBook.copy(title = "New Data Book")

    dataBook.print()

    val (title, author) = dataBook
    println(title)
    println(author)

    val dataBookSet = hashSetOf(dataBook, dataBook2)
    println(dataBookSet)

    val basicBookSet = hashSetOf(basicBook, basicBook2)
    println(basicBookSet)

    println(basicBook)
    println(dataBook)
    println(dataBook3)

    println(basicBook.equals(basicBook2))
    println(dataBook.equals(dataBook2))
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, val price: Double) {
    fun print() = println("you can still add methods to data classes")
}

class BasicBook(val title: String, val author: String, val publicationYear: Int, val price: Double) {
    override fun toString(): String {
        return "BasicBook(title=$title, author=$author, publicationYear=$publicationYear, price=$price)"
    }
}