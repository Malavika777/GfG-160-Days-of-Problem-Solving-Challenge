class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node nn=new Node(-1);
        if(head==null||head.next==null) return nn;
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return nn;
    }
}
