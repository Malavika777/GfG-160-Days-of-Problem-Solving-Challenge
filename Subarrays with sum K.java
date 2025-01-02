class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        int curr=0,res=0;
        for(int i:arr){
            curr+=i;
            if(curr==k) res++;
            if(map.containsKey(curr-k)) res+=map.get(curr-k);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}
