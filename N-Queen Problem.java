class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        boolean[] row=new boolean[n+1];
        boolean[] d1=new boolean[2*n+1];
        boolean[] d2=new boolean[2*n+1];
        nQUtil(1,n,b,res,row,d1,d2);
        return res;
    }
    private static void nQUtil(int j,int n,ArrayList<Integer>b,ArrayList<ArrayList<Integer>>res, boolean[] row, boolean[] d1, boolean[] d2){
        if(j>n){
            res.add(new ArrayList<>(b));
            return;
        }
        for(int i=1;i<=n;i++){
            if(!row[i]&&!d1[i+j]&&!d2[i-j+n]){
                row[i]=d1[i+j]=d2[i-j+n]=true;
                b.add(i);
                nQUtil(j+1,n,b,res,row,d1,d2);
                b.remove(b.size()-1);
                row[i]=d1[i+j]=d2[i-j+n]=false;
            }
        }
    }
}
