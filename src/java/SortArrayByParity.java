
/**
 * 905. 按奇偶排序数组
 * @author LJY
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            while (start < end && A[start] % 2 == 0) {
                start++;
            }
            while (start < end && A[end] % 2 != 0) {
                end--;
            }
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }
        return A;
    }

}
