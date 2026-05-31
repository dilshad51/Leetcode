/*
59. Spiral Matrix II

Link:
https://leetcode.com/problems/spiral-matrix-ii/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int n = 3;

        int[][] result = generateMatrix(n);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        return arr;
    }
}