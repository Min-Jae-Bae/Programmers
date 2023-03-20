package com.example.programmers

fun hidePhoneNumber(phoneNumber: String): String = phoneNumber
    .take(phoneNumber.length - 4)
    .map { "*" }
    .joinToString(separator = "", postfix = phoneNumber.takeLast(4))

fun plusYinYang(absoluteValues: IntArray, signs: BooleanArray): Int =
    signs.mapIndexed { index, hasPlusSign ->
        if (hasPlusSign) absoluteValues[index] else -absoluteValues[index]
    }.sum()
