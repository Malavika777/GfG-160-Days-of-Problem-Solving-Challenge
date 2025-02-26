class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer>s=new Stack<>();
        ArrayList<Integer>len=new ArrayList<>(Collections.nCopies(n,0));
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
            int tp=s.pop();
            int win=s.isEmpty()?i:i-s.peek()-1;
            len.set(tp,win);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int tp=s.pop();
            int win=s.isEmpty()?n:n-s.peek()-1;
            len.set(tp,win);
        }
        for(int i=0;i<n;i++){
            int win=len.get(i)-1;
            res.set(win,Math.max(res.get(win),arr[i]));
        }
        for(int i=n-2;i>=0;i--)
            res.set(i,Math.max(res.get(i),res.get(i+1)));
        return res;
    }
}
