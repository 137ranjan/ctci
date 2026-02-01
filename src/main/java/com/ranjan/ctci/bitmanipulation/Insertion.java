package com.ranjan.ctci.bitmanipulation;

public class Insertion {
    public int updateBits(int n, int m, int i, int j) {
        int allOnes = ~0; // will equal sequence of all 1s

        // 1s before positon j, then 0s. left = 11100000
        int left = allOnes << (j + 1);

        // 1's after position i. right = 00000011
        int right = ((1 << i) - 1);

        // All 1s, except for 0s between i and j. mask = 11100011
        int mask = left | right;

        int n_cleared = n & mask; // clear bits j through i
        int m_shifted = m << i; // move m into correct position

        return n_cleared | m_shifted; // OR them

    }
}
