// ======================================
// LeetCode Problem: find the largest almost missing integer
// Language: java
// Link: https://leetcode.com/problems/find-the-largest-almost-missing-integer/
// Synced by: LinkCode
// Date: 8/19/2026, 1:11:58 AM
// ======================================


class Solution {
    public int largestInteger(int[] A, int k) {
        int[] f = new int[51];
        for (int x : A)
            f[x]++;

        int res = -1, n = A.length;
        for (int i = 0; i < n; i++) 
            if (k == n || (f[A[i]] == 1 && (k == 1 || i == 0 || i == n - 1)))
                res = Math.max(res, A[i]);

        return res;
    }
}