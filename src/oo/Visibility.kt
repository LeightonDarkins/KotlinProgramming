package oo

fun main() {
    val visibility = Visibility()
    val subVisibility = SubVisibility()

    // private means only available within the class
    // visibility.privateVar

    println(visibility.getPrivateVar())

    // protected means available to the class, and subclasses
    // protected visibility is effectively private for a final class
    // visibility.protectedVar

    println(subVisibility.getProtectedVarFromParent())

    // internal means available to the module the class lives in
    println(visibility.internalVar)

    // public means available everywhere
    println(visibility.publicVar)
}

open class Visibility {
    private var privateVar: String = "Private"
    protected var protectedVar: String = "Protected"
    internal var internalVar: String = "Internal"
    var publicVar: String = "Public"

    fun getPrivateVar(): String {
        return privateVar
    }
}

class SubVisibility : Visibility() {
    fun getProtectedVarFromParent(): String {
        return protectedVar
    }
}