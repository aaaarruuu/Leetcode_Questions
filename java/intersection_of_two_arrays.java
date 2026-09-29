// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 9/29/2026, 10:40:45 AM
// ======================================


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums1)
            set.add(x);
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : nums2) {
            if (set.contains(x)) {
                list.add(x);
                set.remove(x);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
}