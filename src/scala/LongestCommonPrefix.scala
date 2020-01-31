object org.jy.LongestCommonPrefix {
  def longestCommonPrefix(strs: String*): String = {
    if (strs == null || strs.isEmpty) return ""
    var shortestLength = strs(0).length
    var index = 0
    val commonStrBuilder = new StringBuilder(shortestLength)
    for (i <- 0 until strs.length) {
      val charsLength = strs(i).length
      if (charsLength < shortestLength) {
        shortestLength = charsLength
        index = i
      }
    }
    val shortestStr = strs(index)
    var i = 0
    for (i <- 0 until shortestLength) {
      val c = shortestStr.charAt(i)
      var flag = true
      var j = 0
      for (j <- 0 until strs.length if j != index) {
        if (strs(j).charAt(i) != c && i == 0) return ""
        if (strs(j).charAt(i) != c) flag = false
      }
      if (flag) commonStrBuilder.append(c)
    }
    commonStrBuilder.toString
  }
}
