class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer>res=new ArrayList<>();
        int m=pat.length(),n=txt.length();
        int[] lps=CalLps(pat);
        int i=0,j=0;
        while(i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                res.add(i-j);
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0) j=lps[j-1];
                else i++;
            }
        }
        return res;
    }
    private int[] CalLps(String s){
        int m=s.length();
        int[] lps=new int[m];
        int len=0,i=1;
        while(i<m){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0) len=lps[len-1];
                else{
                    len=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
