class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n=arr.length;
        int a=1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<0) continue;
            else if(arr[i]==a) a++;
            else if(arr[i]>a) break;
        }
        return a;
    }
}
