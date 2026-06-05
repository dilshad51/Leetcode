/*
1217. Minimum Cost to Move Chips to The Same Position

Link:
https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] position = {1, 2, 3};

        int result = minCostToMoveChips(position);

        System.out.println(result);
    }

    // Solution method
    static int minCostToMoveChips(int[] position) {
        int odd=0;
        int even =0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0) even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
}