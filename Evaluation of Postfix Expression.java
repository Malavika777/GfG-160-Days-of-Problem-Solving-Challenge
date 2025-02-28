class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        for(String s:arr){
            if(s.matches("-?\\d+"))
                st.push(Integer.parseInt(s));
            else{
                int v=st.pop();
                int u=st.pop();
                switch(s){
                    case "+":
                        st.push(u+v);
                        break;
                    case "-":
                        st.push(u-v);
                        break;
                    case "*":
                        st.push(u*v);
                        break;
                    case "/":
                        st.push(u/v);
                        break;
                }
            }
        }
        return st.pop();
    }
}
