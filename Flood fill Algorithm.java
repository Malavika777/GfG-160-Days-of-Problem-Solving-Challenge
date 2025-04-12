class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int n=image.length;
        int m=image[0].length;
        int ori=image[sr][sc];
        if(ori==newColor) return image;
        dfs(image,sr,sc,n,m,ori,newColor);
        return image;
    }
    public static void dfs(int[][] img,int i,int j,int n,int m,int ori,int nC){
        if(i<0||i>=n||j<0||j>=m||img[i][j]!=ori) return;
        img[i][j]=nC;
        dfs(img,i+1,j,n,m,ori,nC);
        dfs(img,i-1,j,n,m,ori,nC);
        dfs(img,i,j+1,n,m,ori,nC);
        dfs(img,i,j-1,n,m,ori,nC);
    }
}
