/*
1920. Build Array from Permutation

Link:
https://leetcode.com/problems/build-array-from-permutation/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = buildArray(nums);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] buildArray(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}