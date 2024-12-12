class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int cnt=0;
        for(int i:arr){
            if(i==target)
                cnt++;
        }
        return cnt;
    }
}
