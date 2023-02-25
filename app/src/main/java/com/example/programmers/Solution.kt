package com.example.programmers

fun checkOddOrEven(number: Int): String {
    var answer = ""
    val remainNumber = (number % 2)
    answer = if (remainNumber == 0) "Even" else "Odd"
    return answer
}
