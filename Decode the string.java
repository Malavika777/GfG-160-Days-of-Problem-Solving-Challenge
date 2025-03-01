class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']') st.push(s.charAt(i));
            else{
                StringBuilder temp=new StringBuilder();
                while(!st.isEmpty()&&st.peek()!='[')
                    temp.append(st.pop());
                temp.reverse();
                st.pop();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty()&&Character.isDigit(st.peek()))
                    num.insert(0,st.pop());
                int n=Integer.parseInt(num.toString());
                StringBuilder repeat=new StringBuilder();
                for(int j=0;j<n;j++)
                    repeat.append(temp);
                for(char c:repeat.toString().toCharArray())
                    st.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()) res.append(st.pop());
        return res.reverse().toString();
    }
}
