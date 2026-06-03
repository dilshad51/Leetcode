/*
566. Reshape the Matrix

Link:
https://leetcode.com/problems/reshape-the-matrix/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1;
        int c = 4;

        int[][] result = matrixReshape(mat, r, c);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c) return mat;
        int row=0,col=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return arr;
    }
}