import java.util

object ReverseString {

  def reverseString(s: String): String = {
    if (s == null || "" == s) return s
    var chars = s.toCharArray
    var stack = new util.Stack[Character]
    for (i <- chars.length - 1 to 0) {
      stack.push(chars(i))
    }
    val stringBuilder = new StringBuilder(chars.length)
    stack.forEach((e: Character) => stringBuilder.append(e.charValue))
    stringBuilder.toString
  }

}
