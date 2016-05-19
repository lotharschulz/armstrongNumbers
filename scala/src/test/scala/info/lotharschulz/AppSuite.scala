package info.lotharschulz

import org.scalatest.WordSpec

class AppSuite extends WordSpec {

  "ArmstrongNumbers instance" when {
    "method generateDummyArmstrongNumbers is called" should{
      "produce a list like" in{
        val aNmbrs : ArmstrongNumbers = new ArmstrongNumbers();
        assert(List(2, 4) === aNmbrs.generateDummyArmstrongNumbers(1,2))
      }
    }
  }

/*
  "2" when {
    "2 as well" should {
      "be equal" in {
        assert(2 === 2)
      }

      "produce NoSuchElementException when head is invoked" in {
        intercept[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
*/
}
