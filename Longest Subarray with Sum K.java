class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer>m=new HashMap<>();
        int res=0,prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==k) res=i+1;
            else if(m.containsKey(prefix-k))
                res=Math.max(res,i-m.get(prefix-k));
            if(!m.containsKey(prefix))
                m.put(prefix,i);
        }
        return res;
    }
}
