class Node{
    int key,value;
    Node next,prev;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=prev;
    }
}
class LRUCache {
    private static int cap;
    private static Map<Integer,Node> cm;
    private static Node head,tail;
    LRUCache(int cap) {
        this.cap=cap;
        this.cm=new HashMap<>();
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    public static int get(int key) {
        if(!cm.containsKey(key)) return -1;
        Node n=cm.get(key);
        remove(n);
        add(n);
        return n.value;
    }
    public static void put(int key, int value) {
        if(cm.containsKey(key)){
            Node oNode=cm.get(key);
            remove(oNode);
        }
        Node node=new Node(key,value);
        cm.put(key,node);
        add(node);
        if(cm.size()>cap){
            Node nDel=tail.prev;
            remove(nDel);
            cm.remove(nDel.key);
        }
    }
    private static void add(Node node){
        Node nn=head.next;
        head.next=node;
        node.prev=head;
        node.next=nn;
        nn.prev=node;
    }
    private static void remove(Node node){
        Node pn=node.prev;
        Node nn=node.next;
        pn.next=nn;
        nn.prev=pn;
    }
}
