class Solution {
    public static int maxProfit(int[] prices) {
        // code here
        int n=prices.length;
        if(n==0) return 0;
        int[][] curr=new int[3][2];
        int[][] next=new int[3][2];
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=2;j++){
                curr[j][1]=Math.max(-prices[i]+next[j][0],next[j][1]);
                curr[j][0]=Math.max(prices[i]+next[j-1][1],next[j][0]);
            }
            System.arraycopy(curr,0,next,0,3);
        }
        return curr[2][1];
    }
}
