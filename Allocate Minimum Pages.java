class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int l=Arrays.stream(arr).max().getAsInt();
        int h=Arrays.stream(arr).sum();
        int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(arr,mid,k)){
                res=mid;
                h=mid-1;
            }else l=mid+1;
        }
        return res;
    }
    public static boolean check(int[] arr,int mid,int k){
        int c=1,pageSum=0;
        for(int i=0;i<arr.length;i++){
            if(pageSum+arr[i]>mid){
                c++;
                pageSum=arr[i];
            }else pageSum+=arr[i];
        }
        return c<=k;
    }
}
