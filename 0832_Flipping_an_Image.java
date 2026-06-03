/*
832. Flipping an Image

Link:
https://leetcode.com/problems/flipping-an-image/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution method
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left=0,right=image[i].length-1;
            while(left<=right){
                int temp=image[i][left]^1;
                image[i][left]=image[i][right]^1;
                image[i][right]=temp;
                left++;
                right--;
            }
        }
        return image;
    }
}