class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];
        dp[0] = 0;

        for(int j = 1; j <= n; j++){
            dp[j] = Integer.MAX_VALUE;

            for(int jump = 1; jump <= 3; jump++){
                int i = j - jump;

                if(i >= 0){
                    int cost = dp[i] + costs[j - 1] + jump * jump;

                    dp[j] = Math.min(dp[j], cost);
                }
                
            }
        }

        return dp[n];
        
    }
}