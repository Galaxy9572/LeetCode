
object org.jy.SortArrayByParity {

  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    var start = 0
    var end = A.length - 1
    while (start < end) {
      while (start < end && A(start) % 2 == 0) {
        start = start + 1
      }
      while (start < end && A(end) % 2 != 0) {
        end = end - 1
      }
      var temp = A(start)
      A(start) = A(end)
      A(end) = temp
    }
    A
  }

}
