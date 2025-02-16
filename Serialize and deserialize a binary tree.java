class Tree {
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        sePre(root,arr);
        return arr;
    }
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int[] i={0};
        return dePre(i,arr);
    }
    private static Node dePre(int[] i,ArrayList<Integer>arr){
        if(arr.get(i[0])==-1){
            i[0]++;
            return null;
        }
        Node root=new Node(arr.get(i[0]));
        i[0]++;
        root.left=dePre(i,arr);
        root.right=dePre(i,arr);
        return root;
    }
    private static void sePre(Node root,ArrayList<Integer>arr){
        if(root==null){
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        sePre(root.left,arr);
        sePre(root.right,arr);
    }
};
