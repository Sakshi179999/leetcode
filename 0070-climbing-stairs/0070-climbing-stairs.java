class Solution {
    
    public int fun(int n,int[] dp){
         if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0){
            return 1;
        }
        return dp[n]= fun(n-2,dp) +fun(n-1,dp);
    }
    public int climbStairs(int n) {
       int[] dp = new int[n+3];
       Arrays.fill(dp,-1);
       return fun(n,dp);
    }
}