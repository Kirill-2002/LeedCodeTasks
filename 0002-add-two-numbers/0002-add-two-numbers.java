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
       ListNode dummy = new ListNode(0);
       ListNode result = dummy;
       int current=0;
       int adder = 0;

       while(l1!=null){
            if(l2==null){
                current = (l1.val+adder)%10;
                adder =(l1.val+adder)/10;
                result.next=new ListNode(current);
                result=result.next;
                l1=l1.next;
            }
            else{
                current = (l1.val + l2.val+adder)%10;
                adder = (l1.val + l2.val+adder)/10;
                result.next=new ListNode(current);
                result=result.next;
                l1=l1.next;
                l2=l2.next;
            }
       }
       while(l2!=null){
            if(l1==null){
                current = (l2.val+adder)%10;
                adder =(l2.val+adder)/10;
                result.next=new ListNode(current);
                result=result.next;
                l2=l2.next;
            }
            else{
                current = (l1.val + l2.val+adder)%10;
                adder = (l1.val + l2.val+adder)/10;
                result.next=new ListNode(current);
                result=result.next;
                l1=l1.next;
                l2=l2.next;
            }
       }
       if(adder==1){
        result.next=new ListNode(adder);
        result=result.next;
        adder=0;
       }
       return dummy.next;
    }
}