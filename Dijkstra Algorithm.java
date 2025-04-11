class Pair{
    int first,sec;
    public Pair(int first,int sec){
        this.first=first;
        this.sec=sec;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(new Pair(e[1],e[2]));
            adj.get(e[1]).add(new Pair(e[0],e[2]));
        }
        PriorityQueue<Pair>pq=new PriorityQueue<Pair>((x,y)->x.sec-y.sec);
        int[] dis=new int[V];
        for(int i=0;i<V;i++) dis[i]=(int)1e9;
        dis[src]=0;
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            int node=pq.peek().first;
            int dist=pq.peek().sec;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int nn=adj.get(node).get(i).first;
                int nd=adj.get(node).get(i).sec;
                if(dist+nd<dis[nn]){
                    dis[nn]=dist+nd;
                    pq.add(new Pair(nn,dis[nn]));
                }
            }
        }
        return dis;
    }
}
