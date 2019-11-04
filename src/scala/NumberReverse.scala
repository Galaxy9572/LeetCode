object NumberReverse {
  def reverse(x: Int): Int = {
    var result = 0
    var reverseNumStr = ""
    if (x == 0) return x
    else if (x < 0) {
      val sb = new StringBuilder(-1 * x + "")
      reverseNumStr = "-" + sb.reverse.toString
    }
    else {
      val sb = new StringBuilder(x + "")
      reverseNumStr = sb.reverse.toString
    }
    try
      result = reverseNumStr.toInt
    catch {
      case e: NumberFormatException =>
    }
    result
  }
}
