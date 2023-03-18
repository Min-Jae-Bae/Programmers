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

fun findRemainder1(number: Int): Int = (1 until number + 1).first { number % it == 1 }

fun changeStringToInt(string: String): Int = string.toInt()

fun arrangeDescendingOrder(number: Long): Long = number
    .toString()
    .map { it }
    .sortedDescending()
    .joinToString("")
    .toLong()

fun findHarshadNumber(number: Int): Boolean {
    return number % number.toString()
        .fold(0) { total, next -> total + Character.digit(next, 10) } == 0
}

fun createSumBetweenTwoIntegers(firstNumber: Int, lastNumber: Int): Long {
    return if (lastNumber > firstNumber) {
        (firstNumber..lastNumber).fold(0) { total, next -> total + next }
    } else {
        (firstNumber downTo lastNumber).fold(0) { total, next -> total + next }
    }
}


fun getCollatzResult(number: Int): Int =
    createCollatzResult(number = number.toLong(), collatzCount = 0)

tailrec fun createCollatzResult(number: Long, collatzCount: Int): Int {
    return when {
        (collatzCount > 500) -> -1
        (number == 1L) -> collatzCount
        else -> {
            createCollatzResult(
                if (number % 2 == 0L) number / 2 else (number * 3) + 1,
                collatzCount + 1
            )
        }
    }
}

fun findKim(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"