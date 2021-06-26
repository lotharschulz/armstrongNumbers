import kotlin.math.absoluteValue

object Armstrong {
    fun isArmstrongNumber(input: Int): Boolean =
        when{
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
                acc.add(input%10)
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
        if(nmbr>0){
            while (nmbr > 0) {
                result.add(nmbr % 10);
                nmbr = nmbr / 10;
            }
            result.reverse()
        } else if (input == 0) {
            result.add(0);
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