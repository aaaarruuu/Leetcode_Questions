// ======================================
// LeetCode Problem: maximum number of non overlapping palindrome substrings
// Language: java
// Link: https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/
// Synced by: LinkCode
// Date: 9/15/2026, 11:12:08 AM
// ======================================


class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length(), ans = 0, end = -1;

        for (int i = 0; i < n; i++) {

            for (int l0 : new int[]{i - 1, i}) {
                int l = l0, r = i;
                while(l>=0 && r < n && s.charAt(l) == s.charAt(r)){
                    if (r - l + 1 >= k && l > end) {
                        ans++;
                        end = r;
                        break;
                    }
                    l--;
                    r++;
                }
            }
        }
        return ans;
    }
}