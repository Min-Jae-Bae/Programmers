package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ProgrammersTest {

    @ParameterizedTest
    @CsvSource(
        "3, Odd",
        "4, Even"
    )
    fun `Check odd or even`(number: Int, oddOrEven: String) {
        assertThat(checkOddOrEven(number = number), `is`(oddOrEven))
    }

}