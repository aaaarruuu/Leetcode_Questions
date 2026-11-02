// ======================================
// LeetCode Problem: partition list
// Language: java
// Link: https://leetcode.com/problems/partition-list/
// Synced by: LinkCode
// Date: 11/2/2026, 8:05:56 PM
// ======================================


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode slist = new ListNode();
        ListNode blist = new ListNode();
        ListNode small = slist;
        ListNode big = blist;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }

            head = head.next;
        }

        small.next = blist.next;
        big.next = null;

        return slist.next;        
    }
}