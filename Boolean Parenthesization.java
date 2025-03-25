class Solution {
    static int countWays(String s) {
        // code here
        int n=s.length();
        int[][][] dp=new int[n][n][2];
        for(int i=0;i<n;i+=2){
            dp[i][i][1]=(s.charAt(i)=='T')?1:0;
            dp[i][i][0]=(s.charAt(i)=='F')?1:0;
        }
        for(int len=2;len<n;len+=2){
            for(int i=0;i<n-len;i+=2){
                int j=i+len;
                dp[i][j][0]=dp[i][j][1]=0;
                for(int k=i+1;k<j;k+=2){
                    char op=s.charAt(k);
                    int lt=dp[i][k-1][1],lf=dp[i][k-1][0];
                    int rt=dp[k+1][j][1],rf=dp[k+1][j][0];
                    if(eval(1,1,op)) dp[i][j][1]+=lt*rt;
                    if(eval(1,0,op)) dp[i][j][1]+=lt*rf;
                    if(eval(0,1,op)) dp[i][j][1]+=lf*rt;
                    if(eval(0,0,op)) dp[i][j][1]+=lf*rf;
                    if(!eval(1,1,op)) dp[i][j][0]+=lt*rt;
                    if(!eval(1,0,op)) dp[i][j][0]+=lt*rf;
                    if(!eval(0,1,op)) dp[i][j][0]+=lf*rt;
                    if(!eval(0,0,op)) dp[i][j][0]+=lf*rf;
                }
            }
        }
        return dp[0][n-1][1];
    }
    private static boolean eval(int a,int b,char op){
        if(op=='&') return (a&b)==1;
        if(op=='|') return (a|b)==1;
        return (a^b)==1;
    }
}
