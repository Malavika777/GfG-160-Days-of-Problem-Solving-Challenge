class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int small=arr[0]+k;
        int lar=arr[n-1]-k;
        int res=arr[n-1]-arr[0];
        for(int i=0;i<n-1;i++){
            int min=Math.min(small,arr[i+1]-k);
            int max=Math.max(lar,arr[i]+k);
            if(min<0) continue;
            res=Math.min(res,max-min);
        }
        return res;
    }
}
