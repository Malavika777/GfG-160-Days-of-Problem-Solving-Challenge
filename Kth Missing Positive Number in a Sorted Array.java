class Solution {
    public int kthMissing(int[] arr, int k) {
        // code he
        int n=arr.length;
        int l=0,h=n-1;
        int res=n+k;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>mid+k){
                res=mid+k;
                h=mid-1;
            }else l=mid+1;
        }
        return res;
    }
}
