package com.app._06_11_2024;

public class KClass {
    public boolean findPair(int[] sortedArray, int k) {
        // 1 2 5 7 8 12 13 16 18 22  == 25
        int start = 0;
        int end = sortedArray.length-1;

        while (start < end) {
            if(sortedArray[start] + sortedArray[end] > k) {
                end--;
            } else if(sortedArray[start] + sortedArray[end] < k) {
                start++;
            }
        }
        return false;
    }
}
