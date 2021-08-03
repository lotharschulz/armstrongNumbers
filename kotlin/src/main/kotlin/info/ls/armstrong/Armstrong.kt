package info.ls.armstrong

import kotlin.math.absoluteValue

const START_NUMBER_RANGE = 100
const END_NUMBER_RANGE = 999

fun main() {
    println("armstrong numbers between 100 & 999 are: ${Armstrong.getArmstrongNumbers(START_NUMBER_RANGE,END_NUMBER_RANGE)}")
}

object Armstrong {
    fun getArmstrongNumbers(start: Int, end: Int): List<Int> {
        require(start >= 1) { "start has to be at least 0" }
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
        if (input == 0) return listOf(0)
        val result = mutableListOf<Int>()
        getDigitsRecursiveAcc(input, result)
        return result.toList()
    }

    fun getDigitsRecursiveAcc(input: Int, acc: MutableList<Int>): List<Int> =
        when {
            input > 0 -> {
                acc.add(input % 10)
                getDigitsRecursiveAcc(input / 10, acc)
            }
            else -> {
                acc.reverse()
                acc
            }
        }

    fun getDigitsIterative(input: Int): List<Int> {
        val result = mutableListOf<Int>()
        var nmbr = input
        if (nmbr> 0) {
            while (nmbr > 0) {
                result.add(nmbr % 10)
                nmbr = nmbr / 10
            }
            result.reverse()
        } else if (input == 0) {
            result.add(0)
        }
        return result
    }

    fun getDigitsViaString(input: Int): List<Int> {
        val digits = ArrayList<Int>()
        if (input >= 0) {
            val inputString: String = input.toString()
            inputString.forEach {
                // https://www.lotharschulz.info/2018/08/05/kotlin-convert-string-containing-only-numbers-to-int/
                digits.add(it.code - 48)
            }
        }
        return digits
    }

    fun getNumberOfDigitsLog(input: Int): Int =
        if (input == 0) 1 else Math.log10(input.toDouble()).toInt() + 1

    fun getNumberOfDigitsStr(input: Int): Int =
        input.toDouble().absoluteValue.toInt().toString().length
}
