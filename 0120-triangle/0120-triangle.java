class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        int r = triangle.size();

        int c = triangle.get(r - 1).size();

        int[][] dp = new int[r][c];

        for(int[] d : dp)
            Arrays.fill(d, Integer.MAX_VALUE);

        return funct(0, 0, triangle, dp);
    }

    public int funct(int r, int c, List<List<Integer>> triangle, int[][] dp) {

        if(r == triangle.size() - 1)
            return triangle.get(r).get(c);

        if(dp[r][c] != Integer.MAX_VALUE)
            return dp[r][c];

        int val = triangle.get(r).get(c);

        int c0 = funct(r + 1, c, triangle, dp);

        int c1 = funct(r + 1, c + 1, triangle, dp);

        return dp[r][c] = val + Math.min(c0, c1);
    }
}