package com.example.programmers

fun checkOddOrEven(number: Int): String {
    var answer = ""
    val remainNumber = (number % 2)
    answer = if (remainNumber == 0) "Even" else "Odd"
    return answer
}

fun createMean(arr: IntArray): Double {
    var answer = 0.0
    answer = arr.sum().toDouble() / arr.size
    return answer
}