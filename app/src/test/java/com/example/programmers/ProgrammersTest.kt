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

    /*TODO: Problem Error converting parameter at index 0*/
    companion object {
        @JvmStatic
        fun getMeanCase() = listOf(
            Arguments.of(arrayOf(1, 2, 3, 4), 2.5),
            Arguments.of(arrayOf(5, 5), 5)
        )
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

    @Test
    fun `Spaced number test`() {
        assertThat(createSpacedNumbers(startNumber = 2, numberCount = 5), `is`(longArrayOf(2,4,6,8,10)))
    }
    @Test
    fun `Spaced number test2`() {
        assertThat(createSpacedNumbers(startNumber = -4, numberCount = 2), `is`(longArrayOf(-4,-8)))
    }
}