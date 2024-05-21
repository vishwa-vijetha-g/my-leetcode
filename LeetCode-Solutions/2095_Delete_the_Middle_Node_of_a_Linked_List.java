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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null){
            return null;
        }

        ListNode h = head;
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }

        int mid = size/2;

        int start=0;
        ListNode rem = h;
        ListNode behindRem = null;
        while(start<mid){
            behindRem = rem;
            rem = rem.next;
            start++;
        }
        behindRem.next = rem.next;
        rem.next = null;
        //System.out.println(behindRem.val + " " + rem.val);
        return h;
    }
}