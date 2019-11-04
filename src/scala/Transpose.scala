object Transpose {

  def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
    val R = A.length
    val C = A(0).length
    val ans = Array.ofDim[Int](C,R)
    for(r <- 0 until R){
      for(c <- 0 until C){
        ans(c)(r) = A(r)(c)
      }
    }
    ans
  }

}
