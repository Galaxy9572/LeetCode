package org.jy;

/**
 * 867. 转置矩阵
 * @author LJY
 */
public class Transpose {

    public int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] transpose = new Transpose().transpose(new int[][]{{1,2,3},{4,5,6}});
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }

}
