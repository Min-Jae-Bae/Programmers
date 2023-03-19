package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ProgrammersTest2 {
    @ParameterizedTest
    @CsvSource(
        "01033334444, *******4444",
        "027778888, *****8888"
    )
    fun `Hide the last 4 digits of your phone number`(phoneNumber: String, hidedNumber: String) {
        assertThat(hidePhoneNumber(phoneNumber = phoneNumber), `is`(hidedNumber))
    }
}