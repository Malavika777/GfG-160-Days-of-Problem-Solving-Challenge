class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(search(mat,i,j,word,0)) return true;
            }
        }
        return false;
    }
    private static boolean search(char[][] mat,int i,int j,String word,int idx){
        int m=mat.length;
        int n=mat[0].length;
        if(idx==word.length()) return true;
        if(i<0||i>=m||j<0||j>=n||mat[i][j]!=word.charAt(idx)) return false;
        char temp=mat[i][j];
        mat[i][j]='#';
        boolean found=search(mat,i+1,j,word,idx+1)||search(mat,i-1,j,word,idx+1)||search(mat,i,j+1,word,idx+1)||search(mat,i,j-1,word,idx+1);
        mat[i][j]=temp;
        return found;
    }
}
