// ======================================
// LeetCode Problem: minimum total distance traveled
// Language: java
// Link: https://leetcode.com/problems/minimum-total-distance-traveled/
// Synced by: LinkCode
// Date: 9/10/2026, 9:00:48 AM
// ======================================


class Solution {
    List<Integer> r;
    int[][] f;
    long[][] dp;

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        r = robot;
        f = factory;

        Collections.sort(r);
        Arrays.sort(f, (a, b) -> Integer.compare(a[0], b[0]));

        dp = new long[r.size()][f.length];
        for (long[] row : dp)
            Arrays.fill(row, -1);

        return solve(0, 0);
    }

    long solve(int i, int j) {
        if (i == r.size()) return 0;
        if (j == f.length) return (long) 1e18;

        if (dp[i][j] != -1)
            return dp[i][j];

        long ans = solve(i, j + 1);
        long dist = 0;

        for (int k = 0; k < f[j][1] && i + k < r.size(); k++) {
            dist += Math.abs((long) r.get(i + k) - f[j][0]);
            ans = Math.min(ans, dist + solve(i + k + 1, j + 1));
        }

        return dp[i][j] = ans;
    }
}