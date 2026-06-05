/*
1380. Lucky Numbers in a Matrix

Link:
https://leetcode.com/problems/lucky-numbers-in-a-matrix/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        List<Integer> result = luckyNumbers(matrix);

        System.out.println(result);
    }

    // Solution method
    static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean lucky=true;
            for(int k=0;k<matrix.length;k++){
                if(min<matrix[k][col]){
                    lucky=false;
                    break;
                }
            }
            if(lucky){
                arr.add(min);
            }
        }
        return arr;
    }
}