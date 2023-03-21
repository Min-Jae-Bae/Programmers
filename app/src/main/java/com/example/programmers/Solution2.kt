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

fun getMiddleLetter(string: String): String {
    return if (string.length % 2 == 0) {
        string.substring(string.length / 2 - 1, string.length / 2 + 1)
    } else {
        string.substring(string.length / 2, string.length / 2 + 1)
    }
}
