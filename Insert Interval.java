class Solution {
    static ArrayList<int[]> insertInterval(int[][] in, int[] nI) {
        // code here
        int n=in.length;
        ArrayList<int[]>res=new ArrayList<>();
        int i=0;
        while(i<n && nI[0]>in[i][1]){
            res.add(in[i]);
            i++;
        }
        while(i<n && nI[1]>=in[i][0]){
            nI[0]=Math.min(nI[0],in[i][0]);
            nI[1]=Math.max(nI[1],in[i][1]);
            i++;
        }
        res.add(new int[]{nI[0],nI[1]});
        while(i<n){
            res.add(in[i]);
            i++;
        }
        return res;
    }
}
