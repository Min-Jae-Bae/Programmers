package com.example.programmers

import kotlin.math.pow
import kotlin.math.sqrt

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

fun createSpacedNumbers(
    startNumber: Int,
    numberCount: Int,
): LongArray = LongArray(numberCount) { index ->
    startNumber.toLong() * (index + 1)
}

fun createReversedArray(number: Long): IntArray = number
    .toString()
    .map {
        Character.digit(it, 10)
    }
    .reversed()
    .toIntArray()

fun determineSquareRoot(number: Long): Long {
    val doubleNumber = number.toDouble()
    val hasSquareRoot = (doubleNumber % sqrt(doubleNumber) == 0.0)
    val result = (sqrt(doubleNumber) + 1).pow(2)

    return if (hasSquareRoot) result.toLong() else -1

}
