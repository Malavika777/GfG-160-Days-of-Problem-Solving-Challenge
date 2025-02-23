class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>=st.peek())
                st.pop();
            res.add(0,st.isEmpty()?-1:st.peek());
            st.push(arr[i]);
        }
        return res;
    }
}
