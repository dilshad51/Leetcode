/*
1295. Find Numbers with Even Number of Digits

Link:
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int result = findNumbers(nums);

        System.out.println(result);
    }

    // Solution method
    static int find(int n) {
        int digits=(int)(Math.log10(n))+1;
        return digits;
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(find(nums[i])%2==0)count++;
        }
        return count;
    }
}