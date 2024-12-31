class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        if(arr.length==0) return 0;
        Set<Integer>set=new HashSet<>();
        for(int i:arr) set.add(i);
        int max=0;
        for(int i:arr){
            if(!set.contains(i-1)){
                int curr=i;
                int cmax=1;
                while(set.contains(curr+1)){
                    curr++;
                    cmax++;
                }
                max=Math.max(max,cmax);
            }
        }
        return max;
    }
}
