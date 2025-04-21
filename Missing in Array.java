class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        int x1=0,x2=0;
        for(int i=0;i<n-1;i++) x1^=arr[i];
        for(int i=1;i<=n;i++) x2^=i;
        return x2^x1;
    }
}
