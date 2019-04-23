package collections

fun main() {
    val list = listOf("Orange", "Apple", "Banana") // immutable list

    val arrayList = arrayListOf("Jim", "Sarah", "Steve") // mutable list
    val peter = arrayListOf("Peter")

    println(arrayList[0])
    println(arrayList + peter)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))

    arrayList.add("Josh")
    arrayList.add(1, "Jack")

    println(arrayList)

    arrayList.remove("Steve")

    println(arrayList)

    val removed = arrayList.remove("Bloot")

    println(removed)

    val subList = arrayList.subList(1,4)

    println(subList)
}