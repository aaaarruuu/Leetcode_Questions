// ======================================
// LeetCode Problem: maximum nesting depth of two valid parentheses strings
// Language: java
// Link: https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
// Synced by: LinkCode
// Date: 9/30/2026, 12:03:41 PM
// ======================================


class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int d = 0;
        int len = seq.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (seq.charAt(i) == '(') {
                ++d;
                res[i] = d % 2;
            } else {
                res[i] = d % 2;
                --d;
            }
        }
        return res;
    }
}