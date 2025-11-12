/**
 * 2025-11-12
 * 題目: 純粋関数のリファクタリングをScalaで行ってみよう
 */
import scala.collection.mutable.ArrayBuffer

class TipCalculator {
  private val names: ArrayBuffer[String] = ArrayBuffer.empty[String]
  private var tipPercentage: Int = 0

  def addPerson(name: String): Unit = {
    names += name
    tipPercentage = calculateTipPercentage(names.length)
  }

  private def calculateTipPercentage(personCount: Int): Int = {
    if (personCount > 5) return 20
    if (personCount > 0) return 10
    0
  }

  def getNames(): ArrayBuffer[String] = names

  def getTipPercentage(): Int = tipPercentage
}

// デバッグ用のコード
object Main {
  def main(args: Array[String]): Unit = {
    val tipCalculator = new TipCalculator()
    tipCalculator.addPerson("a")
    tipCalculator.addPerson("b")
    tipCalculator.addPerson("c")
    tipCalculator.addPerson("d")
    tipCalculator.addPerson("e")
    tipCalculator.addPerson("f")
    tipCalculator.addPerson("g")

    println(tipCalculator.getNames())
    println(tipCalculator.getTipPercentage())
  }
}