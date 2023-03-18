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
        assertThat(
            createSpacedNumbers(startNumber = startNumber, numberCount = numberCount),
            `is`(arrayCase)
        )
    }


    @Test
    fun `Reversed array return test`() {
        assertThat(createReversedArray(12345), `is`(intArrayOf(5, 4, 3, 2, 1)))
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

    @ParameterizedTest
    @CsvSource(
        "1234, 1234",
        "-1234, -1234"
    )
    fun `Change string to int return test`(string: String, int: Int) {
        assertThat(changeStringToInt(string), `is`(int))

    }

    @Test
    fun `Arrange in descending integer order`() {
        assertThat(arrangeDescendingOrder(118372), `is`(873211))
    }

    @ParameterizedTest
    @CsvSource(
        "10, true",
        "12, true",
        "11, false",
        "13, false"
    )
    fun `Harshad number finding test`(number: Int, hasHarshad: Boolean) {
        assertThat(findHarshadNumber(number), `is`(hasHarshad))
    }

    @ParameterizedTest
    @CsvSource(
        "3, 5, 12",
        "3, 3, 3",
        "5, 3, 12"
    )
    fun `Sum between two integers test`(firstNumber: Int, lastNumber: Int, result: Long) {
        assertThat(
            createSumBetweenTwoIntegers(firstNumber = firstNumber, lastNumber = lastNumber),
            `is`(result)
        )
    }

    @ParameterizedTest
    @CsvSource(
        "6, 8",
        "16, 4",
        "626331, -1"
    )
    fun `Collatz guess test`(number: Int, collatzResult: Int) {
        assertThat(getCollatzResult(number = number), `is`(collatzResult))
    }

    @Test
    fun `Find kim location test`() {
        assertThat(findKim(arrayOf("Jane", "Kim")), `is`("김서방은 1에 있다"))
    }

    @ParameterizedTest
    @MethodSource("getDivisibleArrayCase")
    fun `Divisible array of numbers test`(array: IntArray, divisor: Int, divisibleArray: IntArray) {
        assertThat(createDivisibleArray(array = array, divisor = divisor), `is`(divisibleArray))

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
            Arguments.of(2, 5, longArrayOf(2, 4, 6, 8, 10)),
            Arguments.of(-4, 2, longArrayOf(-4, -8))
        )

        @JvmStatic
        fun getDivisibleArrayCase() = listOf(
            Arguments.of(intArrayOf(5, 9, 7, 10), 5, intArrayOf(5, 10)),
            Arguments.of(intArrayOf(2, 36, 1, 3), 1, intArrayOf(1, 2, 3, 36)),
            Arguments.of(intArrayOf(3, 2, 6), 10, intArrayOf(-1))
        )
    }
}

