package binary_and_hex

fun main() {
    // AND
    // only 1 if both are 1

    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 0 == 0
    // 0 and 1 == 0

    println(0b1101 and 0b1000)

    // OR
    // 1 as long as one or both arguments are 1

    // 1 OR 1 == 1
    // 1 OR 0 == 1
    // 0 OR 0 == 0
    // 0 OR 1 == 1

    println(0b1101 or 0b1000)

    // XOR
    // 1 if only one argument is 1

    // 1 XOR 1 == 0
    // 1 XOR 0 == 1
    // 0 XOR 0 == 0
    // 0 XOR 1 == 1

    println(0b1101 xor 0b1000)

    // inverse
    // flip all of the bits in a number

    println(0b10011.inv() and 0x0000001F)
}