package com.example.programmers

fun hidePhoneNumber(phoneNumber: String): String
    = phoneNumber
        .take(phoneNumber.length - 4)
        .map { "*" }
        .joinToString(separator = "", postfix = phoneNumber.takeLast(4))
