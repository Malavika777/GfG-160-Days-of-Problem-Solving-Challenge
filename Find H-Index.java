class Solution {
    // Function to find hIndex
    public int hIndex(int[] cit) {
        // code here
        int n=cit.length;
        int[] count=new int[n+1];
        for(int i:cit){
            if(i>=n){
                count[n]++;
            }
            else{
                count[i]++;
            }
        }
        int total=0,h_ind=0;
        for(int i=n;i>=0;i--){
            total+=count[i];
            if(total>=i){
                h_ind=i;
                break;
            }
        }
        return h_ind;
    }
}
