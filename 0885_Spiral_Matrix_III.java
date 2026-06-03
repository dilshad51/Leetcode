/*
885. Spiral Matrix III

Link:
https://leetcode.com/problems/spiral-matrix-iii/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int rows = 1;
        int cols = 4;
        int rStart = 0;
        int cStart = 0;

        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int ans[][]=new int [rows*cols][2];
        int idx=0;
        ans[idx++]=new int []{rStart,cStart};
        int steps=1;
        while(idx<rows*cols){
            for(int i=0;i<steps;i++){
                cStart++;
                if(0<=rStart && rStart<rows && 0<=cStart&& cStart<cols){
                    ans[idx++] = new int[]{rStart, cStart};
                    if(idx == rows * cols) return ans;
                }
            }
            for(int i=0;i<steps;i++){
                rStart++;
                if(0<=rStart && rStart<rows && 0<=cStart&& cStart<cols){
                    ans[idx++] = new int[]{rStart, cStart};
                    if(idx == rows * cols) return ans;
                }
            }
            for(int i=0;i<steps+1;i++){
                cStart--;
                if(0<=rStart && rStart<rows && 0<=cStart&& cStart<cols){
                    ans[idx++] = new int[]{rStart, cStart};
                    if(idx == rows * cols) return ans;
                }
            }
            for(int i=0;i<steps+1;i++){
                rStart--;
                if(0<=rStart && rStart<rows && 0<=cStart&& cStart<cols) {
                    ans[idx++] = new int[]{rStart, cStart};
                    if(idx == rows * cols) return ans;
                }
            }
            steps+=2;
        }
        return ans;
    }
}