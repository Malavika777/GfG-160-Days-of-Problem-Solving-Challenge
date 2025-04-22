class Solution {
    public int findUnique(int[] arr) {
        // code here
        int res=0;
        for(int i:arr) res^=i;
        return res;
    }
}
