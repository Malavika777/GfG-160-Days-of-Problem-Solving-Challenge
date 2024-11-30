class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int l1=s1.length();
        int l2=s2.length();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(l1!=l2) return false;
        for(int i=0;i<l1;i++){
            if(c1[i]!=c2[i])
                return false;
        }
        return true;
    }
}
