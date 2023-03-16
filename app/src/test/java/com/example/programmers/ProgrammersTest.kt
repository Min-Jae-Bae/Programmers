package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class ProgrammersTest {
    @ParameterizedTest
    @CsvSource(
        "3, Odd",
        "4, Even"
    )
    fun `Correct odd even check test`(number: Int, oddOrEven: String) {
        assertThat(checkOddOrEven(number = number), `is`(oddOrEven))
    }

    @ParameterizedTest
    @MethodSource("getMeanCase")
    fun `Array mean return test`(arr: IntArray, mean: Double) {
        assertThat(createMean(arr = arr), `is`(mean))
    }


    @ParameterizedTest
    @CsvSource(
        "123, 6",
        "987, 24"
    )
    fun `Sum of digits test`(number: Int, sumOfDigit: Int) {
        assertThat(createSumOfDigits(number), `is`(sumOfDigit))
    }

    @ParameterizedTest
    @CsvSource(
        "12, 28",
        "5, 6"
    )
    fun `Divisor sum return test`(number: Int, sumOfDivisors: Int) {
        assertThat(createSumOfDivisors(number), `is`(sumOfDivisors))
    }

    @ParameterizedTest
    @MethodSource("getArrayCase")
    fun `Spaced number return test`(startNumber: Int, numberCount: Int, arrayCase: LongArray) {
        assertThat(createSpacedNumbers(startNumber = startNumber, numberCount = numberCount), `is`(arrayCase))
    }

    /*TODO: Problem Error converting parameter at index 0*/
    companion object {
        @JvmStatic
        fun getMeanCase() = listOf(
            Arguments.of(arrayOf(1, 2, 3, 4), 2.5),
            Arguments.of(arrayOf(5, 5), 5)
        )

        @JvmStatic
        fun getArrayCase() = listOf(
            Arguments.of(2, 5, longArrayOf(2,4,6,8,10)),
            Arguments.of(-4, 2, longArrayOf(-4,-8))
        )
    }

    @Test
    fun `Reversed array return test`() {
        assertThat(createReversedArray(12345), `is`(intArrayOf(5,4,3,2,1)))
    }

    @ParameterizedTest
    @CsvSource(
        "121, 144",
        "3, -1"
    )
    fun `Square return test`(number: Long, result: Long) {
        assertThat(determineSquareRoot(number), `is`(result))
    }

    @ParameterizedTest
    @CsvSource(
        "10, 3",
        "12, 11"
    )
    fun `Remainder 1 return test`(number: Int, remainder: Int) {
        assertThat(findRemainder1(number), `is`(remainder))
    }
}