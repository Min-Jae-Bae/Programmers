package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class ProgrammersTest2 {
    @ParameterizedTest
    @CsvSource(
        "01033334444, *******4444",
        "027778888, *****8888"
    )
    fun `Hide the last 4 digits of your phone number`(phoneNumber: String, hidedNumber: String) {
        assertThat(hidePhoneNumber(phoneNumber = phoneNumber), `is`(hidedNumber))
    }

    @ParameterizedTest
    @MethodSource("getYinYangCase")
    fun `Yin yang addition test`(
        absoluteValues: IntArray,
        signs: BooleanArray,
        additionResult: Int,
    ) {
        assertThat(
            plusYinYang(absoluteValues = absoluteValues, signs = signs),
            `is`(additionResult)
        )

    }

    @ParameterizedTest
    @MethodSource("getEliminationCase")
    fun `Smallest number elimination test`(intArray: IntArray, resultArray: IntArray) {
        assertThat(removeSmallestNumber(intArray = intArray), `is`(resultArray))
    }

    companion object {
        @JvmStatic
        fun getYinYangCase() = listOf(
            Arguments.of(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true), 9),
            Arguments.of(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true), 0)
        )

        @JvmStatic
        fun getEliminationCase() = listOf(
            Arguments.of(intArrayOf(4, 3, 2, 1), intArrayOf(4, 3, 2)),
            Arguments.of(intArrayOf(10), intArrayOf(-1))
        )
    }
}