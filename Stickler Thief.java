class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        int last=arr[0],sec=0,res=0;
        for(int i=1;i<n;i++){
            res=Math.max(arr[i]+sec,last);
            sec=last;
            last=res;
        }
        return res;
    }
}
