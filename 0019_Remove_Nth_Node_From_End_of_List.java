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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode start = head;
        while(start!=null){
            size++;
            start = start.next;
        }

        if(size==1){
            return null;
        }

        int moveUpto = size - n;

        if(moveUpto==0){
            head = head.next;
            return head;
        }
        
        ListNode start2 = head;
        while(moveUpto>1 && start2!=null){
            start2 = start2.next;
            moveUpto--;
        }

        if(start2!=null && start2.next!=null){
            start2.next = start2.next.next;
        }

        return head;
    }
}