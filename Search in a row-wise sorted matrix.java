class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            if(search(mat[i],x)) return true;
        }
        return false;
    }
    public static boolean search(int[] mat,int x){
        int l=0,h=mat.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mat[mid]==x) return true;
            else if(x<mat[mid]) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}
