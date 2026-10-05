// ======================================
// LeetCode Problem: score of parentheses
// Language: java
// Link: https://leetcode.com/problems/score-of-parentheses/
// Synced by: LinkCode
// Date: 10/5/2026, 9:21:24 AM
// ======================================


class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        int dpt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dpt++;
            } else {
                dpt--;
                if (s.charAt(i - 1) == '(') {
                    res += 1 << dpt;
                }
            }
        }
        return res;
    }
}