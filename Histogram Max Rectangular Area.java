class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        Stack<Integer>st=new Stack<>();
        int res=0,tp,curr;
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                tp=st.pop();
                int wid=st.isEmpty()?i:i-st.peek()-1;
                res=Math.max(res,arr[tp]*wid);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            tp=st.pop();
            curr=arr[tp]*(st.isEmpty()?n:n-st.peek()-1);
            res=Math.max(res,curr);
        }
        return res;
    }
}
