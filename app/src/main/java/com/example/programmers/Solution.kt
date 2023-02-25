package com.example.programmers

fun oddAndEven(num: Int): String {
    var answer = ""

    if (num % 2 == 0) answer = "Even"
    if (num % 2 != 0) answer = "Odd"

    return answer
}
