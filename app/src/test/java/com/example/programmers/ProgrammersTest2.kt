package com.example.programmers

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
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
        assertThat(eliminateSmallestNumber(intArray = intArray), `is`(resultArray))
    }

    @ParameterizedTest
    @MethodSource("getMissingAdditionCase")
    fun `Missing number addition test`(numberArray: IntArray, additionResult: Int) {
        assertThat(addMissingNumber(numberArray = numberArray), `is`(additionResult))
    }

    @ParameterizedTest
    @CsvSource(
        "abcde, c",
        "qwer, we"
    )
    fun `Middle letter fetch test`(string: String, middleString: String) {
        assertThat(getMiddleLetter(string = string), `is`(middleString))
    }

    @ParameterizedTest
    @CsvSource(
        "3, 수박수",
        "4, 수박수박"
    )
    fun `Watermelon pattern test`(number: Int, pattern: String) {
        assertThat(createWatermelonPattern(number = number), `is`(pattern))
    }

    @ParameterizedTest
    @MethodSource("getDotProductCase")
    fun `Dot product test`(
        firstIntArray: IntArray,
        secondIntArray: IntArray,
        dotProductResult: Int,
    ) {
        assertThat(
            createDotProduct(
                firstIntArray = firstIntArray,
                secondIntArray = secondIntArray
            ), `is`(dotProductResult)
        )
    }

    @Test
    fun `Sort a string in descending order`() {
        assertThat(sortStringDescending("Zbcdefg"), `is`("gfedcbZ"))
    }


    @ParameterizedTest
    @CsvSource(
        "3, 20, 4, 10"
    )
    fun `Calculate shortfall test`(
        price: Int,
        money: Int,
        count: Int,
        difference: Long,
    ) {
        assertThat(
            calculateShortfall(
                price = price,
                money = money,
                count = count
            ), `is`(difference)
        )
    }

    @ParameterizedTest
    @CsvSource(
        "13, 17, 43",
        "24, 27, 52"
    )
    fun `Number of factors and addition test`(
        firstNumber: Int,
        lastNumber: Int,
        additionResult: Int,
    ) {
        assertThat(
            addNumberOfDivisors(firstNumber = firstNumber, lastNumber = lastNumber),
            `is`(additionResult)
        )

    }

    @ParameterizedTest
    @CsvSource(
        "a234, false",
        "1234, true"
    )
    fun `String handling test`(string: String, hasCondition: Boolean) {
        assertThat(handleString(string = string), `is`(hasCondition))
    }

    @ParameterizedTest
    @CsvSource(
        "1 2 3 4, 1 4",
        "-1 -2 -3 -4, -4 -1",
        "-1 -1, -1 -1"
    )
    fun `Find max, min values`(string: String, valuesResult: String) {
        assertThat(findMaxMinValues(string = string), `is`(valuesResult))

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

        @JvmStatic
        fun getMissingAdditionCase() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0), 14),
            Arguments.of(intArrayOf(5, 8, 4, 0, 6, 7, 9), 6)
        )

        @JvmStatic
        fun getDotProductCase() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2), 3),
            Arguments.of(intArrayOf(-1, 0, 1), intArrayOf(1, 0, -1), -2)
        )
    }
}