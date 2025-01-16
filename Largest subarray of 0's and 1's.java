class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        Map<Integer,Integer>m=new HashMap<>();
        int res=0,prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=(arr[i]==0)?-1:1;
            if(prefix==0) res=i+1;
            else if(m.containsKey(prefix))
                res=Math.max(res,i-m.get(prefix));
            else m.put(prefix,i);
        }
        return res;
    }
}
