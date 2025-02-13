class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        Set<Integer>set=new HashSet<>();
        return find(root,set,target);
    }
    private static boolean find(Node root,Set<Integer>set,int tar){
        if(root==null) return false;
        if(set.contains(tar-root.data)) return true;
        set.add(root.data);
        return find(root.left,set,tar)||find(root.right,set,tar);
    }
}
