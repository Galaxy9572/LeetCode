package org.jy;

/**
 * 832. 翻转图像
 *
 * @author LJY
 */
public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {

        for (int[] ints : A) {
            int len = ints.length;
            int halfLen = (len % 2 == 0) ? len / 2 : (len - 1) / 2;
            for (int j = 0; j < halfLen; j++) {
                ints[j] = ints[j] ^ ints[len - j - 1];
                ints[len - j - 1] = ints[j] ^ ints[len - j - 1];
                ints[j] = ints[j] ^ ints[len - j - 1];
            }

            for (int k = 0; k < len; k++) {
                ints[k] = ints[k] ^ 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(3 >>> 2);
    }

}
