class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n=cost.length;
        int p2=cost[0],p1=cost[1];
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(p1,p2);
            p2=p1;
            p1=curr;
        }
        return Math.min(p2,p1);
    }
};
