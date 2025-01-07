class Solution {
    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        int l=0,r=n-1;
        int c=0;
        while(l<r){
            if(arr[l]+arr[r]<target) l++;
            else if(arr[l]+arr[r]>target) r--;
            else{
                int c1=0,c2=0;
                int e1=arr[l],e2=arr[r];
                while(l<=r&&arr[l]==e1){
                    l++;
                    c1++;
                }
                while(l<=r&&arr[r]==e2){
                    r--;
                    c2++;
                }
                if(e1==e2) c+=((c1*(c1-1))/2);
                else c+=(c1*c2);
            }
        }
        return c;
    }
}
