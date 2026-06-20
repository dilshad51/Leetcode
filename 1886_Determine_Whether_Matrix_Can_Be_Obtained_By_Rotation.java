/*
1886. Determine Whether Matrix Can Be Obtained By Rotation

Link:
https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] mat = {
            {0, 1},
            {1, 0}
        };

        int[][] target = {
            {1, 0},
            {0, 1}
        };

        boolean result = findRotation(mat, target);

        System.out.println(result);
    }

    // Solution method
    static boolean findRotation(int[][] mat, int[][] target) {
        int rotation =4;
        while(rotation >0){
                mat=rotate90(mat);
                if(Arrays.deepEquals(mat,target)) return true;
                rotation--;
            }
        return false;
    }
    public static int[][]rotate90(int [][] mat){
                int n=mat.length;
                int arr [][]= new int [n][n];
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        arr[j][n-1-i]=mat[i][j];
                    }
                }
                return arr;
    }
}