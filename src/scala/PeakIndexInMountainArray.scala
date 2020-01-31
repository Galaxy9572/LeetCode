object org.jy.PeakIndexInMountainArray {

  def peakIndexInMountainArray(A: Array[Int]): Int = {
    for (i <- A.indices) {
      if (A(i) > A(i + 1)) return i
    }
    -1
  }

}
