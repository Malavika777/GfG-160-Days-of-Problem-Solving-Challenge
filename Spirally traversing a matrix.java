class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int left=0,top=0;
        int right=mat[0].length-1,bot=mat.length-1;
        if(mat==null||mat.length==0) return res;
        while(top<=bot&&left<=right){
            for(int i=left;i<=right;i++)
                res.add(mat[top][i]);
            top++;
            for(int i=top;i<=bot;i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    res.add(mat[bot][i]);
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
