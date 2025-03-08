class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n=s.length();
        if(n==0) return "";
        int start=0,max=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=1;j++){
                int low=i,high=i+j;
                while(low>=0&&high<n&&s.charAt(low)==s.charAt(high)){
                    int curr=high-low+1;
                    if(curr>max){
                        start=low;
                        max=curr;
                    }
                    low--;
                    high++;
                }
            }
        }
        return s.substring(start,start+max);
    }
}
