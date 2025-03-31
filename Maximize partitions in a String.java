class Solution {
    public int maxPartitions(String s) {
        // code here
        int[] last=new int[26];
        Arrays.fill(last,-1);
        for(int i=s.length()-1;i>=0;i--){
            if(last[s.charAt(i)-'a']==-1)
                last[s.charAt(i)-'a']=i;
        }
        int cnt=0,a=-1;
        for(int i=0;i<s.length();i++){
            a=Math.max(a,last[s.charAt(i)-'a']);
            if(a==i) cnt++;
        }
        return cnt;
    }
}
