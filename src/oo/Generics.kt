package oo

fun main() {
    // DRY
    // Don't repeat yourself

    val stack = Stack(1,2,3)

    println(stack.elements)

    println(stack.pop())

    stack.push(4)

    println(stack.elements)

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stackOf = stackOf("Hi", "There", "Buddy")

    println(stackOf.elements)
}

fun <Type> stackOf(vararg elements: Type): Stack<Type> {
    return Stack(*elements)
}

class Stack<Element>(vararg items: Element) {

    val elements = items.toMutableList()

    fun push(element: Element) {
        elements.add(element)
    }

    fun pop(): Element? {
        if (isEmpty()) return null

        return elements.removeAt(elements.size -1)
    }

    private fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}