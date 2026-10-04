// ======================================
// LeetCode Problem: valid parenthesis string
// Language: java
// Link: https://leetcode.com/problems/valid-parenthesis-string/
// Synced by: LinkCode
// Date: 10/5/2026, 12:43:14 AM
// ======================================


class Solution {
    public boolean checkValidString(String s) {
        int l = 0;
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                l++;
                h++;
            } else if (s.charAt(i) == ')') {
                if (l > 0) l--;
                h--;
            } else {
                if (l > 0) l--;
                h++;
            }
            if (h < 0) return false;
        }
        return l == 0;
    }
}