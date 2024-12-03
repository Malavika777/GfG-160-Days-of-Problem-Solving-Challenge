class Solution {
    public static int minChar(String s) {
        // Write your code here
        String rev=new StringBuilder(s).reverse().toString();
        String concate=s+"$"+rev;
        int[] lps=CalLps(concate);
        int length=lps[lps.length-1];
        return s.length()-length;

    }
    public static int[] CalLps(String s){
        int n=s.length();
        int[] lps=new int[n];
        int i=1,len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0) len=lps[len-1];
                else {
                    lps[i]=0;
                    i++;
                }
            }
      }
      return lps;
  }
}
