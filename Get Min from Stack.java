class Solution {
    private Stack<Integer> s;
    private int min;
    public Solution() {
        s=new Stack<>();
        min=-1;
    }
    public void push(int x) {
        // code here
        if(s.isEmpty()){
            min=x;
            s.push(x);
        }
        else if(x<min){
            s.push(2*x-min);
            min=x;
        }
        else s.push(x);
    }
    public void pop() {
        // code here
        if(s.isEmpty()) return;
        int top=s.pop();
        if(top<min)
            min=2*min-top;
    }
    public int peek() {
        // code here
        if(s.isEmpty()) return -1;
        int top=s.peek();
        return (min>top)?min:top;
    }
    public int getMin() {
        // code here
        if(s.isEmpty()) return -1;
        return min;
        
    }
}
