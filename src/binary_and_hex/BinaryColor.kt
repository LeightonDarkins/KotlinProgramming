package binary_and_hex

fun main() {
    // binary
    // 0..1

    // 8 4 2 1
    // 1 0 1 0 == 10

    println(0b00001010)
    println(0b11111111)

    println(0xFF0000)
    println(0b11111111_00000000_00000000)

    // bitwise AND
    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 0 == 0
    // 0 and 1 == 0

    println(0b1101 and 0b1011)
    //      1101
    // and  1011
    // -------------
    //      1001

    println(BinaryColor.RED.containsRed())
    println(BinaryColor.YELLOW.containsRed())
    println(BinaryColor.BLUE.containsRed())

    println(0xA3)
}

enum class BinaryColor(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}