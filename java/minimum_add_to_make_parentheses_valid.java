// ======================================
// LeetCode Problem: minimum add to make parentheses valid
// Language: java
// Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Synced by: LinkCode
// Date: 10/6/2026, 12:11:40 PM
// ======================================


class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    res++;
                }
            }
        }
        return res + open;
    }
}