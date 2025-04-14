class Solution {
    static HashMap<Node,Node>map=new HashMap<>();
    Node cloneGraph(Node node) {
        // code here
        if(node==null) return null;
        if(!map.containsKey(node)){
            Node clone=new Node(node.val);
            map.put(node,clone);
            for(Node adj:node.neighbors)
                clone.neighbors.add(cloneGraph(adj));
        }
        return map.get(node);
    }
}
