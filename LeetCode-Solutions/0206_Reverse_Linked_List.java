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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next == null){
            return head;
        }

        ListNode nexti = head.next;
        ListNode prev;
        ListNode curr = null;


        while(nexti!=null){
            prev = curr;
            curr = head;
            head = nexti;
            nexti= nexti.next;
            head.next = curr;
            curr.next = prev;
            
        }

        return head;
    }
}