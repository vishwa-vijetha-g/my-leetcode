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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next==null || head.next.next==null){
            return head;
        }

        ListNode h = head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            if(even.next!=null){
                
                odd = even.next;
            }

            even.next = odd.next;
            if(odd.next!=null){
                
                even = odd.next;
            }
            
        }

        odd.next = evenHead;

        System.out.println(odd.val);
        System.out.println(even.val);
        return h;
    }
}