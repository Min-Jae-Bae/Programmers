package com.example.programmers

import java.util.*

fun hidePhoneNumber(phoneNumber: String): String = phoneNumber
    .take(phoneNumber.length - 4)
    .map { "*" }
    .joinToString(separator = "", postfix = phoneNumber.takeLast(4))

fun plusYinYang(absoluteValues: IntArray, signs: BooleanArray): Int =
    absoluteValues.foldIndexed(0) { index, total, number ->
        total + if (signs[index]) number else -number
    }

fun eliminateSmallestNumber(intArray: IntArray): IntArray {
    val resultArray = intArray.filter { item ->
        item > intArray.minOf { it }
    }.toIntArray()
    return if (resultArray.isEmpty()) intArrayOf(-1) else resultArray
}

fun addMissingNumber(numberArray: IntArray): Int =
    (0..9).filterNot { item ->
        item in numberArray
    }.sum()

fun getMiddleLetter(string: String): String =
    with(string) {
        substring(range = (length / 2 - 1 + (length % 2))..(length / 2))
    }

fun createWatermelonPattern(number: Int): String =
    String(CharArray(number) { index -> if (index % 2 == 0) '수' else '박' })

fun createDotProduct(firstIntArray: IntArray, secondIntArray: IntArray): Int =
    firstIntArray.zip(secondIntArray)
        .sumOf { pair -> pair.first * pair.second }

fun sortStringDescending(string: String): String =
    string.toCharArray()
        .sortedArrayDescending()
        .joinToString(separator = "")

fun calculateShortfall(price: Int, money: Int, count: Int): Long =
    ((1..count).fold(0L) { total, item ->
        total + (item * price)
    }.toLong() - money.toLong()).let { difference ->
        if (difference < 1L) 0L else difference
    }

fun addNumberOfDivisors(firstNumber: Int, lastNumber: Int): Int =
    (firstNumber..lastNumber).sumOf { number ->
        var count = 0
        repeat(number) { item ->
            if (number % (item + 1) == 0) {
                count++
            }
        }.let { if (count % 2 == 0) number else -number }
    }


fun handleString(string: String): Boolean =
    with(string) {
        none {
            length != 4 && length != 6 || it in 'A'..'z'
        }
    }

fun findMaxMinValues(string: String): String =
    string
        .split(" ")
        .map { it.toInt() }
        .let { "${it.min()} ${it.max()}" }


fun createRectangularStar(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    repeat(b) {
        repeat(a) {
            print("*")
        }
        println()
    }
}


fun createJadenCase(string: String): String =
    string
        .lowercase()
        .split(" ")
        .joinToString(separator = " ") {
            it.replaceFirstChar { item ->
                if (item.isLowerCase()) item.titlecase(Locale.getDefault()) else item.toString()
            }
        }


fun repeatBinaryConversion(string: String): IntArray {
    TODO()
}

tailrec fun gcd(num1: Int, num2: Int): Int =
    if (num2 != 0) gcd(num2, num1 % num2) else num1

fun findGreatestLeastCommon(number1: Int, number2: Int): IntArray {
    val gcd = gcd(num1 = number1, num2 = number2)
    return intArrayOf(gcd, number1 * number2 / gcd)
}

fun addMatrix(
    firstIntArray: Array<IntArray>,
    secondIntArray: Array<IntArray>,
): Array<IntArray> {
    return Array(firstIntArray.size) { index1 ->
        IntArray(firstIntArray[0].size) { index2 ->
            firstIntArray[index1][index2] + secondIntArray[index1][index2]
        }
    }
}




