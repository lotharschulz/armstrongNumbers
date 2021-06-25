import kotlin.test.Test
import kotlin.test.assertEquals


class ArmstrongTest {

    @Test
    fun `5 is armstrong number`(){
        assertEquals(true, Armstrong.isArmstrongNumber(5))
    }

    @Test
    fun `test getDigitsRecursive`(){
        val digits1 = listOf(5,8,3,7)
        val result1 = mutableListOf<Int>()
        Armstrong.getDigitsRecursive(5837, result1)
        assertEquals(digits1, result1.toList())
        val digits2 = listOf<Int>()
        val result2 = mutableListOf<Int>()
        Armstrong.getDigitsRecursive(0, result2)
        assertEquals(digits2, result2.toList())
        val result3 = mutableListOf<Int>()
        Armstrong.getDigitsRecursive(-1, result3)
        assertEquals(digits2, result3.toList())
    }

    @Test
    fun `test getDigitsIterative`(){
        assertEquals(listOf(4,3,2,1), Armstrong.getDigitsIterative(4321))
        assertEquals(listOf<Int>(0), Armstrong.getDigitsIterative(0))
        assertEquals(listOf<Int>(), Armstrong.getDigitsIterative(-1))
    }

    @Test
    fun `test getDigitsViaString`(){
        assertEquals(listOf(1,2,3,4), Armstrong.getDigitsViaString(1234))
        assertEquals(listOf<Int>(0), Armstrong.getDigitsViaString(0))
        assertEquals(listOf<Int>(), Armstrong.getDigitsViaString(-1))
    }

    @Test
    fun `test getNumberOfDigitsLog`(){
        val one = 1
        assertEquals(one, Armstrong.getNumberOfDigitsLog(0));
        assertEquals(one, Armstrong.getNumberOfDigitsLog(1));
        assertEquals(one, Armstrong.getNumberOfDigitsLog(-1));
        assertEquals(4, Armstrong.getNumberOfDigitsLog(1243));
        assertEquals(6, Armstrong.getNumberOfDigitsLog(100000));
    }

    @Test
    fun `test getNumberofDigitsStr`(){
        val one = 1
        assertEquals(one, Armstrong.getNumberOfDigitsStr(0));
        assertEquals(one, Armstrong.getNumberOfDigitsStr(1));
        assertEquals(one, Armstrong.getNumberOfDigitsStr(-1));
        assertEquals(4, Armstrong.getNumberOfDigitsStr(1243));
        assertEquals(6, Armstrong.getNumberOfDigitsStr(100000));
    }

}