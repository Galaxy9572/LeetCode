object Palindrome {
  def isPalindrome(x: Int): Boolean = {
    val isPalindrome = {
      if (x == 0) {
        true
      }else if (x < 0) {
        false
      }else {
        val sb = new StringBuilder(x + "")
        val numberStr = sb.toString
        val reverseNumStr = sb.reverse.toString
        numberStr == reverseNumStr
      }
    }
    isPalindrome
  }
}
