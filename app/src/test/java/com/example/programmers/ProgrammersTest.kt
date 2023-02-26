package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
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
    @MethodSource("case")
    fun `Array average return test`(arr: IntArray, mean: Double) {
        assertThat(createMean(arr = arr), `is`(mean))
    }

    companion object {
        @JvmStatic
        fun case() = listOf(
            Arguments.of(arrayListOf(1,2,3,4), 2.5),
            Arguments.of(arrayListOf(5, 5), 5)
        )
    }
}