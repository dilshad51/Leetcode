/*
1929. Concatenation of Array

Link:
https://leetcode.com/problems/concatenation-of-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] getConcatenation(int[] nums) {
        int [] arr=new int [2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}