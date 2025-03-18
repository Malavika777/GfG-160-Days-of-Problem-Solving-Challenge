class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n=arr.length,sum=0;
        for(int i: arr) sum+=i;
        if(sum%2!=0) return false;
        sum/=2;
        boolean[] curr=new boolean[sum+1];
        boolean[] prev=new boolean[sum+1];
        prev[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j<arr[i-1]) curr[j]=prev[j];
                else curr[j]=prev[j]||prev[j-arr[i-1]];
            }
            System.arraycopy(curr,0,prev,0,sum+1);
        }
        return prev[sum];
    }
}
