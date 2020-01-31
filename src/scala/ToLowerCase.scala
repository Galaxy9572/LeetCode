object org.jy.ToLowerCase {
  def toLowerCase(str: String): String = {
    if (str == null || str.length == 0) return str
    val chars = str.toCharArray
    for (i <- 0 until chars.length) {
      if (chars(i) >= 'A' && chars(i) <= 'Z') {
        chars(i) = (chars(i).toInt + 32).toChar
      }
    }
    new String(chars)
  }
}
