// ======================================
// LeetCode Problem: find missing elements
// Language: java
// Link: https://leetcode.com/problems/find-missing-elements/
// Synced by: LinkCode
// Date: 8/4/2026, 11:10:57 AM
// ======================================


class Solution {

    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            st.add(x);
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!st.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}