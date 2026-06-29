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

   public int length(ListNode head){
     int len=0;
     while(head!=null){
      len++;
      head=head.next;
     }
     return len;
   }

    public ListNode removeNthFromEnd(ListNode head, int n) {
            int len=length(head);
            if(n==len){
              return head.next;
            }else{
              ListNode curr=head;
              int count=len-n-1;
              while(count>0){
                curr=curr.next;
                count--;
              }
              curr.next=curr.next.next;
              return head;
            }
    }
}
