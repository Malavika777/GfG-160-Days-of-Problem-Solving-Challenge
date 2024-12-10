class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int n=intervals.length;
        if(n==1) return 0;
        int c=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prev=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=prev){
                prev=intervals[i][1];
            }
            else{
                c++;
            }
        }
        return c;
    }
}
