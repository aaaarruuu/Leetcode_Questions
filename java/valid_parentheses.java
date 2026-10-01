// ======================================
// LeetCode Problem: valid parentheses
// Language: java
// Link: https://leetcode.com/problems/valid-parentheses/
// Synced by: LinkCode
// Date: 10/1/2026, 10:40:48 AM
// ======================================


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}