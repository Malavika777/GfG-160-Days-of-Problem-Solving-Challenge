class Solution {
    public int myAtoi(String s) {
        // Your code here
        int sign=1,max=2147483647,min=-2147483648;
        int i=0,res=0,n=s.length();
        while(i<n && s.charAt(i)==' ') i++;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int num=s.charAt(i)-'0';
            if(res>(max-num)/10)
                return (sign==-1)?min:max;
            res=res*10+num;
            i++;
        }
        return res*sign;
    }
}
