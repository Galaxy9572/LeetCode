object org.jy.JudgeCircle {

  def judgeCircle(moves: String): Boolean = {
    if (moves == null || moves.length == 0) return true
    val pos = Array(0, 0)
    for (i <- 0 until moves.length) {
      moves.charAt(i) match {
        case 'U' =>
          pos(1) += 1
        case 'D' =>
          pos(1) -= 1
        case 'L' =>
          pos(0) -= 1
        case 'R' =>
          pos(0) += 1
      }
    }
    pos(0) == pos(1) && pos(1) == 0
  }

}
