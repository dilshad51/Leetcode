/*
1854. Maximum Population Year

Link:
https://leetcode.com/problems/maximum-population-year/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] logs = {
            {1993, 1999},
            {2000, 2010}
        };

        int result = maximumPopulation(logs);

        System.out.println(result);
    }

    // Solution method
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101]; // 1950 to 2050
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];
            arr[birth - 1950] += 1;
            arr[death - 1950] -= 1;
        }
        int sum = 0;
        int max = 0;
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            sum+= arr[i];
            if (sum > max) {
                max = sum;
                ans = i;
            }
        }
        return ans + 1950;
    }
}