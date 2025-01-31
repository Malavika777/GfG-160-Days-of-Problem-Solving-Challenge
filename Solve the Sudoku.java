class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        int n=mat.length;
        int[] row=new int[n];
        int[] col=new int[n];
        int[] box=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=0){
                    row[i]|=(1<<mat[i][j]);
                    col[j]|=(1<<mat[i][j]);
                    box[(i/3)*3+j/3]|=(1<<mat[i][j]);
                }
            }
        }
        solve(mat,0,0,row,col,box);
    }
    private static boolean solve(int[][] mat,int i,int j,int[] row,int[] col,int[] box){
        int n=mat.length;
        if(i==n-1&&j==n) return true;
        if(j==n){
            i++;j=0;
        }
        if(mat[i][j]!=0)
            return solve(mat,i,j+1,row,col,box);
        for(int k=1;k<=n;k++){
            if(isSafe(mat,i,j,k,row,col,box)){
                mat[i][j]=k;
                row[i]|=(1<<k);
                col[j]|=(1<<k);
                box[(i/3)*3+j/3]|=(1<<k);
                if(solve(mat,i,j+1,row,col,box)) return true;
                mat[i][j]=0;
                row[i]&=~(1<<k);
                col[j]&=~(1<<k);
                box[(i/3)*3+j/3]&=~(1<<k);
            }
        }
        return false;
    }
    private static boolean isSafe(int[][] mat,int i,int j,int k,int[] row,int[] col,int[] box){
        if((row[i]&(1<<k))!=0||(col[j]&(1<<k))!=0||(box[(i/3)*3+j/3]&(1<<k))!=0)
            return false;
        return true;
    }
}
