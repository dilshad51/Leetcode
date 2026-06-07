/*
1470. Shuffle the Array

Link:
https://leetcode.com/problems/shuffle-the-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] shuffle(int[] nums, int n) {
        int arr[]=new int [nums.length];
        for(int i=0;i<n;i++){
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[i+n];
        }
        return arr;
    }
}