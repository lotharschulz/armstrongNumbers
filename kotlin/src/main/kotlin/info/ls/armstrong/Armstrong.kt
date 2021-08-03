package info.ls.armstrong

import kotlin.math.absoluteValue

const val START_NUMBER_RANGE = 100
const val END_NUMBER_RANGE = 999
const val REMAINDER_DIVISOR_TEN = 10
const val CODE_POINT_CHAR_DIFFERENCE = 48
const val ZERO = 0
const val ONE = 1

fun main() {
    println( "armstrong numbers between $START_NUMBER_RANGE & $END_NUMBER_RANGE are: " +
        "${Armstrong.getArmstrongNumbers(START_NUMBER_RANGE,END_NUMBER_RANGE)}" )
}

object Armstrong {
    fun getArmstrongNumbers(start: Int, end: Int): List<Int> {
        require(start >= 1) { "start has to be at least $ZERO" }
        require(end >= start) { "end has to be greater than start" }
        return start.rangeTo(end).filter { isArmstrongNumber(it) }.toList()
    }

    fun isArmstrongNumber(input: Int): Boolean =
        when {
            input > -1 -> input == getDigitsRecursive(input).sumOf { digit ->
                Math.pow(digit.toDouble(), getNumberOfDigitsLog(input).toDouble())
            }.toInt()
            else -> false
        }

    fun getDigitsRecursive(input: Int): List<Int> {
        if (input == ZERO) return listOf(ZERO)
        val result = mutableListOf<Int>()
        getDigitsRecursiveAcc(input, result)
        return result.toList()
    }

    fun getDigitsRecursiveAcc(input: Int, acc: MutableList<Int>): List<Int> =
        when {
            input > ZERO -> {
                acc.add(input % REMAINDER_DIVISOR_TEN)
                getDigitsRecursiveAcc(input / REMAINDER_DIVISOR_TEN, acc)
            }
            else -> {
                acc.reverse()
                acc
            }
        }

    fun getDigitsIterative(input: Int): List<Int> {
        val result = mutableListOf<Int>()
        var nmbr = input
        if (nmbr > ZERO) {
            while (nmbr > ZERO) {
                result.add(nmbr % REMAINDER_DIVISOR_TEN)
                nmbr = nmbr / REMAINDER_DIVISOR_TEN
            }
            result.reverse()
        } else if (input == ZERO) {
            result.add(ZERO)
        }
        return result
    }

    fun getDigitsViaString(input: Int): List<Int> {
        val digits = ArrayList<Int>()
        if (input >= ZERO) {
            val inputString: String = input.toString()
            inputString.forEach {
                // https://www.lotharschulz.info/2018/08/05/kotlin-convert-string-containing-only-numbers-to-int/
                digits.add(it.code - CODE_POINT_CHAR_DIFFERENCE)
            }
        }
        return digits
    }

    fun getNumberOfDigitsLog(input: Int): Int =
        if (input == 0) ONE else Math.log10(input.toDouble()).toInt() + ONE

    fun getNumberOfDigitsStr(input: Int): Int =
        input.toDouble().absoluteValue.toInt().toString().length
}
