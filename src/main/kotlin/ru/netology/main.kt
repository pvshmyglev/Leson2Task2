package ru.netology

fun main() {
    val likes : Int = 21
    val postfix: String = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
    println("Ваша работа понравилась: $likes $postfix")
}