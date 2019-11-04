import scala.collection.mutable

object NewJewelsInStones {

  def numJewelsInStones(J: String, S: String): Int = {
    if (J == null || "" == J || S == null || "" == S) {
      return 0
    }
    val jewelSet = new mutable.HashSet[Char]()
    J.foreach(e => jewelSet.add(e))
    S.chars().filter(e => jewelSet.contains(e.toChar)).count().toInt
  }

  def main(args: Array[String]): Unit = {
    print(NewJewelsInStones.numJewelsInStones("Aa", "aAAbbbb"))
  }
}
