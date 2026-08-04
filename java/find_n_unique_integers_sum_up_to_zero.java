// ======================================
// LeetCode Problem: find n unique integers sum up to zero
// Language: java
// Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// Synced by: LinkCode
// Date: 8/4/2026, 11:24:26 AM
// ======================================


class Solution {
    public int[] sumZero(int n) {
        int[] rsl = new int[n];
        rsl[0] = n * (1 - n) / 2;
        for (int i = 1; i < n; ++i)
            rsl[i] = i;
        return rsl;
    }
}