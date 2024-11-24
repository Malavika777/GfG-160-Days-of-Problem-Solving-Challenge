class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}
