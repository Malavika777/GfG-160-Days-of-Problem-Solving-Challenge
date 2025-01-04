class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int c=0;
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            int rem=target-arr[i];
            while(l<r){
                int s=arr[l]+arr[r];
                if(s==rem){
                    if(arr[l]==arr[r]){
                        int cnt=r-l+1;
                        c+=(cnt*(cnt-1))/2;
                        break;
                    }
                    else{
                        int lc=1,rc=1;
                        while(l+1<r&&arr[l]==arr[l+1]){
                            lc++;
                            l++;
                        }
                        while(r-1>l&&arr[r]==arr[r-1]){
                            rc++;
                            r--;
                        }
                        c+=lc*rc;
                        l++;
                        r--;
                    }
                }
                else if(s<rem) l++;
                else r--;
            }
        }
        return c;
    }
}
