/*
73. Set Matrix Zeroes

Link:
https://leetcode.com/problems/set-matrix-zeroes/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static void setZeroes(int[][] matrix) {
        Set<Integer> rows= new HashSet<>();
        Set<Integer> cols=new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int r: rows){
            for(int j=0;j<matrix[0].length;j++){
                matrix[r][j]=0;
            }
        }
        for(int c: cols){
            for(int i=0;i<matrix.length;i++){
                matrix[i][c]=0;
            }
        }
    }
}