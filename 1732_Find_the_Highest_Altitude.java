/*
1732. Find the Highest Altitude

Link:
https://leetcode.com/problems/find-the-highest-altitude/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println(result);
    }

    // Solution method
    static int largestAltitude(int[] gain) {
        int arr[]=new int [gain.length+1];
        arr[0]=0;
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}