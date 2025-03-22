class Solution {
    int maxValue(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        int ans=0;
        ans=Math.max(ans,maxVal(arr,0,n-2));
        ans=Math.max(ans,maxVal(arr,1,n-1));
        return ans;
    }
    private static int maxVal(int[] arr,int x,int y){
        int n=arr.length;
        int prev2=arr[x];
        int prev1=Math.max(arr[x],arr[x+1]);
        for(int j=x+2;j<=y;j++){
            int take=arr[j]+prev2;
            int not=prev1;
            int curr=Math.max(take,not);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
