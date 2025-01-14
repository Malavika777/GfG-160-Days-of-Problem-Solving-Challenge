class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefix=0,total=0;
        for(int i:arr) total+=i;
        for(int i=0;i<arr.length;i++){
            int suff=total-prefix-arr[i];
            if(suff==prefix) return i;
            prefix+=arr[i];
        }
        return -1;
    }
}
