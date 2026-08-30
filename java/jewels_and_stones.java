// ======================================
// LeetCode Problem: jewels and stones
// Language: java
// Link: https://leetcode.com/problems/jewels-and-stones/
// Synced by: LinkCode
// Date: 8/30/2026, 7:40:37 PM
// ======================================


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> Set = new HashSet<>();
        
        for (int i = 0; i < jewels.length(); i++) {
            Set.add(jewels.charAt(i));
        }
        
        int count = 0;
        
        for (int j = 0; j < stones.length(); j++) {
            if (Set.contains(stones.charAt(j))) {
                count++;
            }
        }
        
        return count;
    }
}