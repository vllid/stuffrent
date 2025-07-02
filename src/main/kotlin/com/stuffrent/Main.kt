package me.vlead.com.stuffrent

fun main() {
    val name = readln()

    val realName = getRealName(name)
    println("Hello, $realName")
}

fun getRealName(name: String): String =
    if (name.length > 0) name else "someone"