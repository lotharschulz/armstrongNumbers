package info.lotharschulz

import org.scalatest.WordSpec

class AppSuite extends WordSpec {
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
}
