object Armstrong {
    fun isArmstrongNumber(input: Int): Boolean = true

    fun getDigits(input: Int, acc: MutableList<Int>): List<Int> =
        when {
            input > 0 -> {
                acc.add(input%10)
                getDigits(input / 10, acc)
            }
            else -> {
                acc.reverse()
                acc
            }
        }

    fun getDigits2(input: Int): List<Int> {
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

    fun getDigits3(input: Int): List<Int> {
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
}