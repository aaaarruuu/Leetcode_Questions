// ======================================
// LeetCode Problem: maximum frequency stack
// Language: java
// Link: https://leetcode.com/problems/maximum-frequency-stack/
// Synced by: LinkCode
// Date: 10/1/2026, 11:09:02 AM
// ======================================


import java.util.*;
class FreqStack {
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> grp;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap<>();
        grp = new HashMap<>();
        maxFreq = 0;
    }
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        grp.putIfAbsent(f, new Stack<>());
        grp.get(f).push(val);
        maxFreq = Math.max(maxFreq, f);
    }
    public int pop() {
        int val = grp.get(maxFreq).pop();
        freq.put(val, freq.get(val) - 1);
        if (grp.get(maxFreq).isEmpty()) {
            maxFreq--;
        }
        return val;
    }
}