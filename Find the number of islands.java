class Solution {
    // Function to find the number of islands.
    public int countIslands(char[][] grid) {
        // Code here
        int cnt=0;
        if(grid==null || grid.length==0)
            return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='L'){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
    void dfs(char[][] grid,int i,int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || 
        grid[i][j]!='L')
            return ;
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i-1,j-1);
        dfs(grid,i+1,j+1);
        dfs(grid,i+1,j-1);
        dfs(grid,i-1,j+1);
    }
        
}
