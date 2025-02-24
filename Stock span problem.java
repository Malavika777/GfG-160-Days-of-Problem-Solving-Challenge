class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]) st.pop();
            if(st.isEmpty())
                res.set(i,i+1);
            else
                res.set(i,i-st.peek());
            st.push(i);
        }
        return res;
    }
}
