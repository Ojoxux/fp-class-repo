/**
 * 2025-11-17
 * 題目: JavaコードをScalaに書き換えてみよう
 * Memo: Scalaではobjectで定義するとインスタンス化しなくても使える
 * Memo:状態を保ちたいならclassで定義する。
 */

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
     if (names.size > 5) 20
     else if (names.size > 0) 10
     else 0
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val emptyGroup = List.empty[String]
    val smallGroup = List("Alice", "Bob", "Charlie")
    val largeGroup = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")

    println(TipCalculator.getTipPercentage(emptyGroup))
    println(TipCalculator.getTipPercentage(smallGroup))
    println(TipCalculator.getTipPercentage(largeGroup))
    }
}
