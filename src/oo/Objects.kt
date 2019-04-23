package oo

fun main() {
    val cache = Cache

    println(cache.retrieveData())
    println(cache.name)
}

object Cache {
    const val name = "Cache"

    fun retrieveData(): Int {
        return 0
    }
}