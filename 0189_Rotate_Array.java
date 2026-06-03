/*
189. Rotate Array

Link:
https://leetcode.com/problems/rotate-array/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    // Solution method
    static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int arr[]=new int [len];
        for(int i=0;i<k;i++){
            arr[i]=nums[len-k+i];
        }
        for(int i=k;i<len;i++){
            arr[i]=nums[i-k];
        }
        for(int i=0;i<len;i++){
            nums[i]=arr[i];
        }
    }
}