package com.example.programmers

fun checkOddOrEven(number: Int): String {
    val hasDivisors = (number % 2 == 0)
    return if (hasDivisors) "Even" else "Odd"
}

fun createMean(arr: IntArray): Double {
    val arrTotalSum = arr.sum()
    val arrSize = arr.size
    return arrTotalSum.toDouble() / arrSize
}

fun createSumOfDigits(number: Int): Int {
    val numberString = number.toString()
    val numberList = numberString.chunked(1)

    val sumOfDigit = numberList.sumOf { numberItem ->
        numberItem.toInt()
    }
    return sumOfDigit
}

fun createSumOfDivisors(number: Int): Int {
    return (1 until number + 1).filter { numberItem ->
        number % numberItem == 0
    }.sum()
}