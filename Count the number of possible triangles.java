class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int res=0;
        for(int i=2;i<arr.length;i++){
            int l=0,r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    res+=(r-l);
                    r--;
                }
                else l++;
            }
        }
        return res;
    }
}
