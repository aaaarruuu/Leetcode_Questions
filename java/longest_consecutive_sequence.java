// ======================================
// LeetCode Problem: longest consecutive sequence
// Language: java
// Link: https://leetcode.com/problems/longest-consecutive-sequence/
// Synced by: LinkCode
// Date: 9/29/2026, 10:52:31 AM
// ======================================


class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = 1;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}