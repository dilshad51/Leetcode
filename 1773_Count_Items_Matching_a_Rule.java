/*
1773. Count Items Matching a Rule

Link:
https://leetcode.com/problems/count-items-matching-a-rule/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println(result);
    }

    // Solution method
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx;
        if(ruleKey.equals("type")) idx=0;
        else if (ruleKey.equals("color")) idx=1;
        else idx=2;
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue)) count++;
        }
        return count;
    }
}