/*
26. Remove Duplicates from Sorted Array

Link:
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        int k = removeDuplicates(nums);

        System.out.println(k);

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Solution method
    static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}