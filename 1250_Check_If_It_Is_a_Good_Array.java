/*
1250. Check If It Is a Good Array

Link:
https://leetcode.com/problems/check-if-it-is-a-good-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {12, 5, 7, 23};

        boolean result = isGoodArray(nums);

        System.out.println(result);
    }

    // Solution method
    static boolean isGoodArray(int[] nums) {
        int g=nums[0];
        for(int i=1;i<nums.length;i++){
            g=gcd(g,nums[i]);
        }
        return g==1;
    }
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}