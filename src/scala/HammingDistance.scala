object org.jy.HammingDistance {

  def hammingDistance(x: Int, y: Int): Int = {
    if (x == y) {
      return 0
    }
    var count = 0
    var mask = 1
    for (i <- 0 until 32) {
      if ((x & mask) != (y & mask)) {
        count += 1
      }
      mask <<= 1
    }
    count
  }

}
