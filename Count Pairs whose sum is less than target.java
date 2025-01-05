class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        int c=0;
        while(l<r){
            int s=arr[l]+arr[r];
            if(s<target){
                c+=r-l;
                l++;
            }
            else r--;
        }
        return c;
    }
}
