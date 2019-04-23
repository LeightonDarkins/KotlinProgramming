package binary_and_hex

fun main() {
    // 0..9 (decimal)
    // 0..9, A, B, C, D, E, F (hexadecimal) 0x10 = (binary) 16
    println(0x10)
    println(0x1F)
    println(0x00)
    println(0xFF)
    println(0xCAFEBABE)

    println(0x000000)
    println(0xFFFFFF)
    println(0xFF0000) // RED
    println(0x00FF00) // GREEN
    println(0x0000FF) // BLUE

    println(Color.BLUE.rgb)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}