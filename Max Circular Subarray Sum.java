class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        // your code here
        int n=arr.length;
        int maxSum=kadaneMax(arr,n);
        int minSum=kadaneMin(arr,n);
        if(maxSum<0) return maxSum;
        int tot=0;
        for(int i:arr) tot+=i;
        int maxC=tot-minSum;
        return Math.max(maxC,maxSum);
    }
    public static int kadaneMax(int []arr,int n){
        int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<n;i++){
            curr=Math.max(curr+arr[i],arr[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
    public static int kadaneMin(int []arr,int n){
        int min=arr[0];
        int curr=arr[0];
        for(int i=1;i<n;i++){
            curr=Math.min(curr+arr[i],arr[i]);
            min=Math.min(min,curr);
        }
        return min;
    }
}
