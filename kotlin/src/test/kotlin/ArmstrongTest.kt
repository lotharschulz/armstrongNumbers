import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class ArmstrongTest {

    @Test
    fun `test isArmstrongNumber`() {
        // 3 digit armstrong numbers
        assertTrue(Armstrong.isArmstrongNumber(153))
        assertTrue(Armstrong.isArmstrongNumber(370))
        assertTrue(Armstrong.isArmstrongNumber(371))
        assertTrue(Armstrong.isArmstrongNumber(407))
        // 3 digit NONE armstrong numbers
        assertTrue(Armstrong.isArmstrongNumber(0))
        assertFalse(Armstrong.isArmstrongNumber(154))
        assertFalse(Armstrong.isArmstrongNumber(100))
        assertFalse(Armstrong.isArmstrongNumber(-100))
        assertFalse(Armstrong.isArmstrongNumber(-1))
        // all one digit numbers are armstrong numbers
        assertTrue(Armstrong.isArmstrongNumber(1))
        assertTrue(Armstrong.isArmstrongNumber(2))
        assertTrue(Armstrong.isArmstrongNumber(3))
        assertTrue(Armstrong.isArmstrongNumber(4))
        assertTrue(Armstrong.isArmstrongNumber(5))
        assertTrue(Armstrong.isArmstrongNumber(6))
        assertTrue(Armstrong.isArmstrongNumber(7))
        assertTrue(Armstrong.isArmstrongNumber(8))
        assertTrue(Armstrong.isArmstrongNumber(9))
    }

    @Test
    fun `test getDigitsRecursive`(){
        assertEquals(listOf(5,8,3,7), Armstrong.getDigitsRecursive(5837))
        assertEquals(listOf(4,3,2,1), Armstrong.getDigitsRecursive(4321))
        assertEquals(listOf<Int>(), Armstrong.getDigitsRecursive(-1))
        // getDigitsRecursive(0) return listOf(0)
        // unlike
        // getDigitsRecursiveAcc(0, mutableListOf<Int>()) that leaves the mutable list empty
        assertEquals(listOf<Int>(0), Armstrong.getDigitsRecursive(0))
    }

    @Test
    fun `test getDigitsRecursiveAcc`(){
        val digits1 = listOf(5,8,3,7)
        val result1 = mutableListOf<Int>()
        Armstrong.getDigitsRecursiveAcc(5837, result1)
        assertEquals(digits1, result1.toList())
        val digits2 = listOf<Int>()
        val result2 = mutableListOf<Int>()
        Armstrong.getDigitsRecursiveAcc(0, result2)
        assertEquals(digits2, result2.toList())
        val result3 = mutableListOf<Int>()
        Armstrong.getDigitsRecursiveAcc(-1, result3)
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