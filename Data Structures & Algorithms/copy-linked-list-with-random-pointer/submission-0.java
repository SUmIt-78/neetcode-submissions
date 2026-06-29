/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> originalToCopy= new HashMap<>();
        Node curr=head;
        while(curr!=null){
          Node dummy=new Node(curr.val);
          originalToCopy.put(curr,dummy);
          curr=curr.next;
        }
      curr=head;
      Node dummy=new Node(0);
      while(curr!=null){
       Node copy=originalToCopy.get(curr);
       copy.next=originalToCopy.get(curr.next);
       copy.random=originalToCopy.get(curr.random);
       curr=curr.next;
      }
      return originalToCopy.get(head);
    }
}
