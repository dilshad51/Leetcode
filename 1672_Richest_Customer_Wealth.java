/*
1672. Richest Customer Wealth

Link:
https://leetcode.com/problems/richest-customer-wealth/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int result = maximumWealth(accounts);

        System.out.println(result);
    }

    // Solution method
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(max<sum) max=sum;
        }
        return max;
    }
}