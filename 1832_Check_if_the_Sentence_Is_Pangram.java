/*
1832. Check if the Sentence Is Pangram

Link:
https://leetcode.com/problems/check-if-the-sentence-is-pangram/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);

        System.out.println(result);
    }

    // Solution method
    static boolean checkIfPangram(String sentence) {
        Set <Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        return set.size()==26;
    }
}