/*
198. House Robber

Link:
https://leetcode.com/problems/house-robber/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        int result = rob(nums);

        System.out.println(result);
    }

    // Solution method
    static int rob(int[] nums) {
        if(nums.length==0) return 0;
        int first=0;
        int second=0;
        for(int num: nums){
            int temp=second;
            second=Math.max(second,first+num);
            first=temp;
        }
        return second;
    }
}