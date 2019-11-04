import scala.collection.mutable

object TwoSum {
  def main(args: Array[String]): Unit = {
    twoSum(Array(2,7,11,15),9)
  }

  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    val length = numbers.length
    val map = new mutable.HashMap[Int, Int]()
    for (i <- 0 until length) {
      map += (numbers(i) -> i)
    }
    for (i <- 0 until length) {
      val anotherNum = target - numbers(i)
      if (map.contains(anotherNum) && map(anotherNum) != i) {
        return Array[Int](i, map(anotherNum))
      }
    }
    throw new RuntimeException("No such index")
  }
}
