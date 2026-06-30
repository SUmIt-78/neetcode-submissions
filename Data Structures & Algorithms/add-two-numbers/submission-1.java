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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayDeque<Integer> stack1=new ArrayDeque<>();
        ArrayDeque<Integer> stack2=new ArrayDeque<>();
        while(l1!=null && l2!=null){
            stack1.offer(l1.val);
            stack2.offer(l2.val);
            l1=l1.next;
            l2=l2.next;
        }
          
          while(l1!=null){
            stack1.offer(l1.val);
            l1=l1.next;
          }

             while(l2!=null){
            stack2.offer(l2.val);
            l2=l2.next;
          }

        ListNode dummy=new ListNode(1);
        ListNode curr=dummy;
        int carry=0;
        while(!stack1.isEmpty() && !stack2.isEmpty()){
             int num1=stack1.poll();
             int num2=stack2.poll();
                 int num=(num1+num2+carry)%10;
                  carry= (num1+num2+carry)/10;
                  curr.next=new ListNode(num);
                  curr=curr.next;
        }

           while(!stack1.isEmpty()){
             int num1=stack1.poll();
                 int num=(num1+carry)%10;
                  carry= (num1+carry)/10;
                  curr.next=new ListNode(num);
                  curr=curr.next;
        }

           while(!stack2.isEmpty()){
             int num2=stack2.poll();
                 int num=(num2+carry)%10;
                  carry= (num2+carry)/10;
                  curr.next=new ListNode(num);
                  curr=curr.next;
        }


        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
