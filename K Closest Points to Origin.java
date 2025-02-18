class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->find(b)-find(a));
        for(int[] i:points){
            if(pq.size()<k)
                pq.offer(i);
            else{
                if(find(i)<find(pq.peek())){
                    pq.poll();
                    pq.offer(i);
                }
            }
        }
        int[][] res=new int[k][2];
        int idx=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            res[idx][0]=curr[0];
            res[idx][1]=curr[1];
            idx++;
        }
        return res;
    }
    private static int find(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
}
