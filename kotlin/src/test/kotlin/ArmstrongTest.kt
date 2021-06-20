import kotlin.test.Test
import kotlin.test.assertEquals

class ArmstrongTest {

    @Test
    fun `5 is armstrong number`(){
        assertEquals(true, Armstrong.isArmstrongNumber(5))
    }
}