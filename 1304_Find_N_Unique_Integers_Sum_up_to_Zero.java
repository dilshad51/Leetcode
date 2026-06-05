/*
1304. Find N Unique Integers Sum up to Zero

Link:
https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
*/

import java.util.*;

class Solution {

    // Main method
    public static void main(String[] args) {

        int n = 5;

        int[] result = sumZero(n);

        System.out.println(Arrays.toString(result));
    }

    // Solution method
    static int[] sumZero(int n) {
        int arr[]=new int [n];
        int idx=0;
        for(int i=1;i<=n/2;i++){
            arr[idx++]=+i;
            arr[idx++]=-i;
        }
        if(n%2!=0) arr[idx]=0;
        return arr;
    }
}