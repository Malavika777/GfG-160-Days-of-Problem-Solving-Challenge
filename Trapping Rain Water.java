class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int l=0,r=n-1;
        int lm=arr[l],rm=arr[r];
        int c=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,arr[l]);
                c+=(lm-arr[l]);
            }
            else{
                r--;
                rm=Math.max(rm,arr[r]);
                c+=(rm-arr[r]);
            }
        }
        return c;
    }
}
