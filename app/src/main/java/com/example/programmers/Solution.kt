package com.example.programmers

fun checkOddOrEven(number: Int): String {
    var answer = ""
    val remainNumber = (number % 2)
    answer = if (remainNumber == 0) "Even" else "Odd"
    return answer
}

fun createMean(arr: IntArray): Double {
    var answer = 0.0
    val arrTotalSum = arr.sum()
    val arrSize = arr.size

    answer = arrTotalSum.toDouble() / arrSize
    return answer
}

fun createSumOfDigits(number: Int): Int {
    val numberString = number.toString()
    val sumOfDigits = numberString.map { numberIndex ->
        numberIndex.code
    }.sum()

    return sumOfDigits
}