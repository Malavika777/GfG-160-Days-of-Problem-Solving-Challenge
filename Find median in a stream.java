class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer>min=new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer>max=new PriorityQueue<>();
        ArrayList<Double>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            min.add(arr[i]);
            int temp=min.poll();
            max.add(temp);
            if(max.size()>min.size()){
                temp=max.poll();
                min.add(temp);
            }
            double median;
            if(min.size()!=max.size())
                median=min.peek();
            else
                median=(min.peek()+max.peek())/2.0;
            res.add(median);
        }
        return res;
    }
}
