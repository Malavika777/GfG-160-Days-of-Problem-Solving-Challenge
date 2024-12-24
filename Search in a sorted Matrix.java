class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length;
        int l=0,h=n*m-1;
        while(l<=h){
            int mid=(l+h)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x) return true;
            else if(mat[row][col]<x) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}
