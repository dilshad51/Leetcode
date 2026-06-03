/*
66. Plus One

Link:
https://leetcode.com/problems/plus-one/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] plusOne(int[] digits) {
        int l=digits.length;
        for(int i=l-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<=9) return digits;
            else digits[i]=0;
        }
        int ans[]=new int [l+1];
        ans[0]=1;
        return ans;
    }
}