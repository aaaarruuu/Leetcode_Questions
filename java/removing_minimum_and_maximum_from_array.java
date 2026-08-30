// ======================================
// LeetCode Problem: removing minimum and maximum from array
// Language: java
// Link: https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
// Synced by: LinkCode
// Date: 8/30/2026, 7:46:55 PM
// ======================================


class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length, a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[a]) a = i;
            if (nums[i] > nums[b]) b = i;
        }
        int l = Math.min(a, b), r = Math.max(a, b);
        return Math.min(r + 1, Math.min(n - l, (l + 1) + (n - r)));
    }
}