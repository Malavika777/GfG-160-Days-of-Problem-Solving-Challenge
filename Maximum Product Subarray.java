class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int cur_max=arr[0];
        int cur_min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=cur_max;
                cur_max=cur_min;
                cur_min=temp;
            }
            cur_min=Math.min(arr[i]*cur_min,arr[i]);
            cur_max=Math.max(arr[i]*cur_max,arr[i]);
            max=Math.max(max,cur_max);
        }
        return max;
    }
}
