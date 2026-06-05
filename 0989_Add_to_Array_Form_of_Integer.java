/*
989. Add to Array-Form of Integer

Link:
https://leetcode.com/problems/add-to-array-form-of-integer/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = addToArrayForm(num, k);

        System.out.println(result);
    }

    // Solution method
    static List<Integer> addToArrayForm(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=nums.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k+=nums[i];
                i--;
            }
            ans.add(k%10);
            k/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}