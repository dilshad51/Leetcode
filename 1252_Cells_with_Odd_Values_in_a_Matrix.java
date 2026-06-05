/*
1252. Cells with Odd Values in a Matrix

Link:
https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int m = 2;
        int n = 3;

        int[][] indices = {
            {0, 1},
            {1, 1}
        };

        int result = oddCells(m, n, indices);

        System.out.println(result);
    }

    // Solution method
    static int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int [m][n];
        for(int i=0;i<indices.length;i++){
            int r=indices[i][0], c=indices[i][1];{
                for(int col=0;col<n;col++) arr[r][col]++;
                for(int row=0;row<m;row++) arr[row][c]++;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0)count++;
            }
        }
        return count;
    }
}