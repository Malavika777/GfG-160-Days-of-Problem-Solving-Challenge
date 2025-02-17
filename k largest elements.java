class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(k);
        for(int i=0;i<k;i++)
            pq.add(arr[i]);
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty())
            res.add(pq.poll());
        Collections.reverse(res);
        return res;
    }
}
