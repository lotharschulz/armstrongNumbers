import kotlin.test.Test
import kotlin.test.assertEquals


class ArmstrongTest {

    @Test
    fun `5 is armstrong number`(){
        assertEquals(true, Armstrong.isArmstrongNumber(5))
    }

    @Test
    fun `getDigits`(){
        val digits1 = listOf(5,8,3,7)
        val result1 = mutableListOf<Int>()
        Armstrong.getDigits(5837, result1)
        assertEquals(digits1, result1.toList())
        val digits2 = listOf<Int>()
        val result2 = mutableListOf<Int>()
        Armstrong.getDigits(0, result2)
        assertEquals(digits2, result2.toList())
        val result3 = mutableListOf<Int>()
        Armstrong.getDigits(-1, result3)
        assertEquals(digits2, result3.toList())
    }

    @Test
    fun `getDigits2`(){
        assertEquals(listOf(4,3,2,1), Armstrong.getDigits2(4321))
        assertEquals(listOf<Int>(0), Armstrong.getDigits2(0))
        assertEquals(listOf<Int>(), Armstrong.getDigits2(-1))
    }

    @Test
    fun `getDigits3`(){
        assertEquals(listOf(1,2,3,4), Armstrong.getDigits3(1234))
        assertEquals(listOf<Int>(0), Armstrong.getDigits3(0))
        assertEquals(listOf<Int>(), Armstrong.getDigits3(-1))
    }
}