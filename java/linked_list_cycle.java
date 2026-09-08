// ======================================
// LeetCode Problem: linked list cycle
// Language: java
// Link: https://leetcode.com/problems/linked-list-cycle/
// Synced by: LinkCode
// Date: 9/8/2026, 10:35:48 AM
// ======================================


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}