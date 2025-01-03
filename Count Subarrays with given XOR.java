class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer>m=new HashMap<>();
        int res=0;
        int pre=0;
        for(int i:arr){
            pre^=i;
            res+=m.getOrDefault(pre^k,0);
            if(pre==k) res++;
            m.put(pre,m.getOrDefault(pre,0)+1);
        }
        return res;
    }
}
