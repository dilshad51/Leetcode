/*
867. Transpose Matrix

Link:
https://leetcode.com/problems/transpose-matrix/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = transpose(matrix);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int mat[][]=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
}