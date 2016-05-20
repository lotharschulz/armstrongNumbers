package info.lotharschulz

import scala.math.log10;

object App {
  def main(args: Array[String]) =
    println("Hello World!")
}

class ArmstrongNumbers() {
  def generateDummyArmstrongNumbers(start: Int, end: Int): List[Int] = {
    List(start+1, end+2)
  }

  def getNumberOfDigits(number: Int): Int = number match {
    case 0 => 1
    case _ => (log10(number) + 1).toInt
  }
}

