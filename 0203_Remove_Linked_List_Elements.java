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
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null && head.val==val){
            head = head.next;
        }

        ListNode newHead = head;
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
                curr = curr.next;
                continue;

            }
            prev = curr;
            curr = curr.next;
        }

        return newHead;
    }
}