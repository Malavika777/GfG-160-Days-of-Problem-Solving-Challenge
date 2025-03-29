class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        List<int[]>job=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>(Arrays.asList(0,0));
        for(int i=0;i<n;i++)
            job.add(new int[]{deadline[i],profit[i]});
        job.sort(Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int[] j:job){
            if(j[0]>pq.size())
                pq.add(j[1]);
            else if(!pq.isEmpty()&&pq.peek()<j[1]){
                pq.poll();
                pq.add(j[1]);
            }
        }
        while(!pq.isEmpty()){
            res.set(1,res.get(1)+pq.poll());
            res.set(0,res.get(0)+1);
        }
        return res;
    }
}
