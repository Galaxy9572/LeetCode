package org.jy;

/**
 * 852. 山脉数组的峰顶索引
 * @author LJY
 */
public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] > A[i + 1]){
                return i;
            }
        }
        return -1;
    }

}
