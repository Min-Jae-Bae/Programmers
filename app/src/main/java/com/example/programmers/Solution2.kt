package com.example.programmers

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

fun addNumberOfDivisors(firstNumber: Int, lastNumber: Int): Int {
    return 0
}

fun handleString(string: String): Boolean =
    with(string) {
        none {
            length != 4 && length != 6 || it in 'A'..'z'
        }
    }

fun findMaxMinValues(string: String): String {
    val sortedValues = string
        .split(" ")
        .map { it.toInt() }
        .sorted()

    return with(sortedValues) {
        first().toString() + " " + last().toString()
    }
}



