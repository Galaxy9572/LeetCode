package org.jy;

public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int[][] matrix = new int[n][n];
        int num = 1, tar = n * n;
        while (num <= tar) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            } // left to right.
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            } // top to bottom.
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            } // right to left.
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            } // bottom to top.
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] ints = new GenerateMatrix().generateMatrix(5);
        for (int i = 0; i < ints.length; i++) {
            for (int y = 0; y < ints.length; y++) {
                System.out.print(ints[i][y] + " ");
            }
            System.out.println();
        }
    }

}
