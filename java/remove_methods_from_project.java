// ======================================
// LeetCode Problem: remove methods from project
// Language: java
// Link: https://leetcode.com/problems/remove-methods-from-project/
// Synced by: LinkCode
// Date: 8/5/2026, 10:10:50 AM
// ======================================


class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] g = new ArrayList[n];
        Arrays.setAll(g, i -> new ArrayList<>());
        for (int[] inv : invocations) g[inv[0]].add(inv[1]);

        boolean[] vis = new boolean[n];
        dfs(k, g, vis);

        for (int[] inv : invocations) {
            if (!vis[inv[0]] && vis[inv[1]]) {
                List<Integer> all = new ArrayList<>();
                for (int i = 0; i < n; i++) all.add(i);
                return all;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) if (!vis[i]) res.add(i);
        return res;
    }

    private void dfs(int u, List<Integer>[] g, boolean[] vis) {
        vis[u] = true;
        for (int v : g[u]) if (!vis[v]) dfs(v, g, vis);
    }
}
