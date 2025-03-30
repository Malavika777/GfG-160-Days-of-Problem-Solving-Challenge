class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int tot=0,curr=0,idx=0;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            tot+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                idx=i+1;
            }
        }
        if(tot<0)
            return -1;
        return idx;
    }
}
