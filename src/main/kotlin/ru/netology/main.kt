package ru.netology

fun main() {
    val likes : Int = 311
    val postfix: String = if (likes % 10 == 1 && (likes % 100) != 11) "человеку" else "людям"
    println("Ваша работа понравилась: $likes $postfix")
}