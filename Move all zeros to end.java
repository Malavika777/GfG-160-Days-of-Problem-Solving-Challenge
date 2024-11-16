class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int curr=0;
        int non=0;
        for(int i=0;i<arr.length;i++){
            if(arr[curr]!=0){
                int temp=arr[curr];
                arr[curr]=arr[non];
                arr[non]=temp;
                non++;
            }
            curr++;
        }
        
    }
}
