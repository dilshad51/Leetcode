/*
75. Sort Colors

Link:
https://leetcode.com/problems/sort-colors/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    // Solution method
    static void sortColors(int[] nums) {
         int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}