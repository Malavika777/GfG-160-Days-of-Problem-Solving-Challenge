class Solution {
    public int minCoins(int coins[], int sum) {
        // Your code goes here
        int[] dp=new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=coins.length-1;i>=0;i--){
            for(int j=1;j<=sum;j++){
                int take=Integer.MAX_VALUE;
                int notake=Integer.MAX_VALUE;
                if(j-coins[i]>=0&&coins[i]>0){
                    take=dp[j-coins[i]];
                    if(take!=Integer.MAX_VALUE) take++;
                }
                if(i+1<coins.length) notake=dp[j];
                dp[j]=Math.min(take,notake);
            }
        }
        if(dp[sum]!=Integer.MAX_VALUE) return dp[sum];
        return -1;
    }
}
