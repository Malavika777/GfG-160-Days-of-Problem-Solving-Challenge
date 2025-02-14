class Solution {
    void correctBST(Node root) {
        // code here.
        Node[] first={null},mid={null},last={null},prev={null};
        find(root,first,mid,last,prev);
        if(first[0]!=null&&last[0]!=null)
            swap(first[0],last[0]);
        else if(first[0]!=null&&mid[0]!=null)
            swap(first[0],mid[0]);
    }
    private static void find(Node root,Node[] first,Node[] mid,Node[] last,Node[] prev){
        if(root==null) return;
        find(root.left,first,mid,last,prev);
        if(prev[0]!=null&&root.data<prev[0].data){
            if(first[0]==null){
                first[0]=prev[0];
                mid[0]=root;
            }
            else{
                last[0]=root;
            }
        }
        prev[0]=root;
        find(root.right,first,mid,last,prev);
    }
    private static void swap(Node a,Node b){
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }
}
