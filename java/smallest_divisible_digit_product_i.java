// ======================================
// LeetCode Problem: smallest divisible digit product i
// Language: java
// Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/
// Synced by: LinkCode
// Date: 8/6/2026, 8:56:23 AM
// ======================================


class Solution {
    public int smallestNumber(int n, int t) {
        int q = n / 10, r = n % 10;

        int req = t / gcd(q + (10 - q) / 10, t);
        int nxt = ((r + req - 1) / req) * req;
        int x = nxt - (nxt - 10) * (nxt / 10);

        return q * 10 + x;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}