/*
1431. Kids With the Greatest Number of Candies

Link:
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    // Solution method
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max=candies[i];
        }
        List<Boolean> arr = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) arr.add(true);
            else arr.add(false);
        }
        return arr;
    }
}