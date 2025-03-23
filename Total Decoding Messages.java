class Solution {
    public int countWays(String s) {
        // code here
        int n=s.length();
        if(n==0||s.charAt(0)=='0') return 0;
        int p1=1,p2=0;
        for(int i=1;i<=n;i++){
            int curr=0;
            if(s.charAt(i-1)!='0') curr+=p1;
            if(i>1){
                int two=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                if(two>=10&&two<=26) curr+=p2;
            }
            p2=p1;
            p1=curr;
        }
        return p1;
    }
}
