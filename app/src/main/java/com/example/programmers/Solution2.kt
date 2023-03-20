package com.example.programmers

fun hidePhoneNumber(phoneNumber: String): String = phoneNumber
    .take(phoneNumber.length - 4)
    .map { "*" }
    .joinToString(separator = "", postfix = phoneNumber.takeLast(4))

fun plusYinYang(absoluteValues: IntArray, signs: BooleanArray): Int =
    absoluteValues.foldIndexed(0) { index, total, item ->
        total + if (signs[index]) item else -item
    }
