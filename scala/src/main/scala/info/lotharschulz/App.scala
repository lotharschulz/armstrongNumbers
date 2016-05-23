package info.lotharschulz

import scala.math.log10;
import scala.math.pow;
import scala.collection.mutable.ListBuffer

object App {
  def main(args: Array[String]) =
    println("Hello World!")
}

class ArmstrongNumbers() {
  def generateDummyArmstrongNumbers(start: Int, end: Int): List[Int] = {
    List(start+1, end+2)
  }

  def isArmstrongNumber(number: Int): Boolean = {
    if(number > -1) number == getDigits(number).toStream.map( x => pow(x, getNumberOfDigits(number)) ).sum
    else false
  }

  def getNumberOfDigits(number: Int): Int = number match {
    case 0 => 1
    case _ => (log10(number) + 1).toInt
  }

  def getDigits(number: Int): List[Int] = number match {
    case 0 => List(0)
    case _ => {
        var nmbr = number
        var d = new ListBuffer[Int]()
        while (nmbr > 0) {
          d += (nmbr % 10)
          nmbr = nmbr / 10
        }
        d.toList.reverse
      }
    }

  def getDigitsAlt(number: Int): List[Int] = {
    if (number < 0){
      List()
    } else {
      number.toString.toList.map(_.toString).map(_.toInt)
    }
  }

}

