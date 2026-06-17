/*
1512. Number of Good Pairs

Link:
https://leetcode.com/problems/number-of-good-pairs/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = numIdenticalPairs(nums);

        System.out.println(result);
    }

    // Solution method
    static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}