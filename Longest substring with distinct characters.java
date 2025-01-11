class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0,max=0;
        HashSet<Character>m=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(m.contains(s.charAt(i))){
                m.remove(s.charAt(left));
                left++;
            }
            m.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        return max;
        
    }
}
