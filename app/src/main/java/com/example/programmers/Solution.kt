package com.example.programmers

class Solution {
    fun solution(num: Int): String {
        var answer = ""

        if (num % 2 == 0) answer = "Even"
        if (num % 2 != 0) answer = "Odd"

        return answer
    }
}