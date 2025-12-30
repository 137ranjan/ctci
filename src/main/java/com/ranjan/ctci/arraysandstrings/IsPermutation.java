package com.ranjan.ctci.arraysandstrings;

public class IsPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("apple", "paple"));
        System.out.println(isPermutation("apple", "elpaa"));
    }

    public static boolean isPermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int[] freqArr = new int[256];
        for (char ch : first.toCharArray()) {
            freqArr[ch]++;
        }
        for (char ch : second.toCharArray()) {
            freqArr[ch]--;
        }
        for (int i=0; i< freqArr.length; i++) {
            if (freqArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
