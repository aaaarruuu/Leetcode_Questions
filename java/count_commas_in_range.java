// ======================================
// LeetCode Problem: count commas in range
// Language: java
// Link: https://leetcode.com/problems/count-commas-in-range/
// Synced by: LinkCode
// Date: 9/8/2026, 10:35:55 AM
// ======================================


class Solution {
    public int countCommas(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= 1000) {
                count++;
            }
        }
        return count;
    }
}