class Solution {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words,(a,b)->a.length()-b.length());
        HashMap<String,Integer>m=new HashMap<>();
        int res=0;
        for(String w:words){
            m.put(w,1);
            for(int i=0;i<w.length();i++){
                String pred=w.substring(0,i)+w.substring(i+1);
                if(m.containsKey(pred))
                    m.put(w,Math.max(m.get(w),m.get(pred)+1));
            }
            res=Math.max(res,m.get(w));
        }
        return res;
    }
}
