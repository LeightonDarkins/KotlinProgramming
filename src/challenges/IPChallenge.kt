package challenges

import java.io.File

fun main() {
    val ipToCount = mutableMapOf<String, Int>()

    File("src/challenges/60.ips.txt").forEachLine {
        val countForThisIP = ipToCount.getOrDefault(it, 0)

        ipToCount[it] = countForThisIP + 1
    }

    val mostCommonIP = ipToCount.maxBy { it.value }!!

    println(mostCommonIP.key)
}