class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        String con=s1+s1;
        return kmp(con,s2);
    }
    public static boolean kmp(String txt,String pat){
        int[] lps=CalLps(pat);
        int i=0,j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==pat.length()) return true;
            }
            else{
                if(j!=0) j=lps[j-1];
                else i++;
            }
        }
        return false;
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
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
