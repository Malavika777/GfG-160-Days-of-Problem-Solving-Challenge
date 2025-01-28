class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String>res=new ArrayList<>();
        Map<Character,Integer>m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        getPerm(m,res,sb,s.length());
        return res;
    }
    private static void getPerm(Map<Character,Integer> m,ArrayList<String> res,StringBuilder curr,int n){
        if(curr.length()==n){
            res.add(curr.toString());
            return;
        }
        for(Map.Entry<Character,Integer>entry:m.entrySet()){
            char c=entry.getKey();
            int cnt=entry.getValue();
            if(cnt==0) continue;
            curr.append(c);
            m.put(c,cnt-1);
            getPerm(m,res,curr,n);
            curr.deleteCharAt(curr.length()-1);
            m.put(c,cnt);
        }
    }
}
