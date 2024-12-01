class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer>m=new HashMap<>();
        char[] ch=s.toCharArray();
     
        for(char c:ch)
            m.put(c,m.getOrDefault(c,0)+1);
        for(char c:ch){
            if(m.get(c)==1)
                return c;
        }
        return '$';
    }
}
