/*
55. Jump Game

Link:
https://leetcode.com/problems/jump-game/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};

        boolean result = canJump(nums);

        System.out.println(result);
    }

    // Solution method
    static boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIdx=0;
        for(int i=0;i<n;i++){
            if(i>maxIdx) return false;
            maxIdx=Math.max(maxIdx,i+nums[i]);
        }
        return true;
    }
}