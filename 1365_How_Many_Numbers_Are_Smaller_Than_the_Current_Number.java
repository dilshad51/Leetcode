/*
1365. How Many Numbers Are Smaller Than the Current Number

Link:
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        int[] result = smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr=new int[nums.length];
        for (int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (nums[j]<nums[i]) count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}