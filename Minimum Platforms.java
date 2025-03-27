class Solution {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length,res=0;
        int j=0,cnt=0;
        for(int i=0;i<n;i++){
            while(j<n&&dep[j]<arr[i]){
                cnt--;
                j++;
            }
            cnt++;
            res=Math.max(res,cnt);
        }
        return res;
    }
}
