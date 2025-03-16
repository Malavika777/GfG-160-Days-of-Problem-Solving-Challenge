class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n=arr.length;
        if(arr[0]==0) return -1;
        int max=0,curr=0,jump=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,i+arr[i]);
            if(max>=n-1) return jump+1;
            if(i==curr){
                if(i==max) return -1;
                else{
                    jump++;
                    curr=max;
                }
            }
        }
        return -1;
    }
}
