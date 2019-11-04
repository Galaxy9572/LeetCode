import java.util

import scala.collection.mutable

object IsBracketsValid {
  def isValid(s: String): Boolean = {
    if (s == null || s.length % 2 != 0) return false
    else if (s.length == 0) return true
    val map = new mutable.HashMap[Char, Char]()
    map += ('(' -> ')')
    map += ('[' -> ']')
    map += ('{' -> '}')
    val chars = s.toCharArray
    val stack = new util.Stack[Character]()
    for (c <- chars) {
      if (c == '(' || c == '[' || c == '{') stack.push(c)
      else {
        if (stack.empty) return false
        val pop = stack.pop
        if (map(pop) != c) return false
      }
    }
    stack.empty
  }

  def main(args: Array[String]): Unit = {
    println(isValid("){"))
    println(isValid("()[]{}"))
    println(isValid("({[()]})"))
    println(isValid("(]"))
    println(isValid("([)]"))
  }
}
