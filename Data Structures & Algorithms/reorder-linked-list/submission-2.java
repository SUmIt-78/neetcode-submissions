/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

  public ListNode midPointer(ListNode head){
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
  }

  public ListNode reverse(ListNode head){
    ListNode prev=null;
    ListNode next=null;
    while(head!=null){
      next=head.next;
      head.next=prev;
      prev=head;
      head=next;
    }
    return prev;
  }

    public void reorderList(ListNode head) {
        ListNode mid=midPointer(head);
        ListNode right=reverse(mid.next);
        mid.next=null;
        ListNode left=head;
          
          while(right!=null){
            ListNode leftNext=left.next;
            ListNode rightNext=right.next;
            left.next=right;
            right.next=leftNext;
            left=leftNext;
            right=rightNext;
          }
    }
}
