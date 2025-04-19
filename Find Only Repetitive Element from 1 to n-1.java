class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n=arr.length;
        int res=0;
        for(int i=1;i<=n-1;i++)
            res^=i;
        for(int i=0;i<n;i++)
            res^=arr[i];
        return res;
    }
}
