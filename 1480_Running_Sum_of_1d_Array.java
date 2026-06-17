/*
1480. Running Sum of 1d Array

Link:
https://leetcode.com/problems/running-sum-of-1d-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] runningSum(int[] nums) {
        int [] arr=new int[nums.length];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+nums[i];
            arr[i]= sum;
        }
        return arr;
    }
}