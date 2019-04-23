package challenges

fun main() {

}

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String, val genre: String, val publicationYear: Int): Lendable {
    override fun borrow() {
        println("borrowing is always the same")
    }
}

class ChallengeBook(title: String, genre: String, publicationYear: Int, val author: String): InventoryItem(title, genre, publicationYear) {
    fun read() {
        println("reading...")
    }
}

class DVD(title: String, genre: String, publicationYear: Int, val length: Int): InventoryItem(title, genre, publicationYear) {
    fun watch() {
        println("watching...")
    }
}