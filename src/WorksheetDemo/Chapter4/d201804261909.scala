package WorksheetDemo.Chapter4
import java.awt.Font
import java.util

import scala.collection.JavaConverters.mapAsScalaMap
import scala.collection.JavaConverters.propertiesAsScalaMap
import scala.collection.JavaConverters.mapAsJavaMap
import java.awt.font.TextAttribute._
object d201804261909 {
  def main(args: Array[String]): Unit = {
    val scores_1 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val scores_2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val scores_3 = scala.collection.mutable.Map[String, Int]()
    val scores_4 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
    val bobScore = scores_2("Bob")
    val bobScore_2 = if (scores_2.contains("Bob")) scores_2("Bob") else 0
    val bobScore_3 = scores_2.getOrElse("Bob", 0)
    val score1 = scores_2.withDefaultValue(0)
    val zeldasScore1 = score1.get("Zelda")
    val score2 = scores_2.withDefault(_.length)
    val zeldasScore2 = score2.get("Zelda")
    scores_2("Bob") = 10
    scores_2("Fred") = 7
    scores_2 += ("Bob" -> 10, "Fred" -> 7)
    scores_2 -= "Aloce"
    val newScores = scores_1 + ("Bob" -> 10, "Fred" -> 7)
    var scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    scores = scores + ("QAQ" -> 10)
    scores += ("QAQ" -> 10)
    scores = scores - "Alice"
    scores -= "Alice"
    scores.keySet
    for(v <- scores.values) println(v)
    val scores_5 = scala.collection.mutable.SortedMap("Alice" -> 10, "Fred" -> 2, "Bob" -> 3, "May" -> 5)
/*
    val scores_6: scala.collection.mutable.Map[String, Int] =
      new java.util.TreeMap[String, Int]
    val props: scala.collection.Map[String, String] =
      System.getProperties()
*/
    /*val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
    val font = new java.awt.Font((attrs))
*/
    val t = (1, 3.14, "Fred")
//    val first = t._1
//    val second = t._2
//    val third = t._3
//    val (first, second, third) = t
    val (first, second, _) = t
    "New York".partition(_.isUpper)
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    Array(("<", 2),("-", 10),(">", 2))
    for ((s, n) <- pairs) print(s * n)
  }
}
