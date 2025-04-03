class Pair{
    int row;
    int col;
    int tm;
    Pair(int _row,int _col,int _tm){
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}
class Solution {
    // Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int[][] vis=new int[n][m];
        int cfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }if(grid[i][j]==1) cfresh++;
            }
        }
        int tm=0;
        int res=0;
        int[] dRow={-1,0,1,0};
        int[] dCol={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nRow=r+dRow[i];
                int nCol=c+dCol[i];
                if(nRow<n && nRow>=0 && nCol<m && nCol>=0){
                    if(vis[nRow][nCol]==0 && grid[nRow][nCol]==1){
                        q.add(new Pair(nRow,nCol,t+1));
                        vis[nRow][nCol]=2;
                        res++;
                    }
                }
            }
        }
        if(res!=cfresh) return -1;
        return tm;
    }
}
