// ======================================
// LeetCode Problem: minimum moves to equal array elements ii
// Language: java
// Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
// Synced by: LinkCode
// Date: 11/2/2026, 8:12:57 PM
// ======================================


class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mdn = nums[nums.length / 2];
        int mvs = 0;
        for (int num : nums) {
            mvs += Math.abs(num - mdn);
        }
        return mvs;
    }
}