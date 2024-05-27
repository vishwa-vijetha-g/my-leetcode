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
    public boolean isPalindrome(ListNode head) {

        ListNode start1 = head;
        ListNode end1 = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            end1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast!=null){
            end1 = slow;
            slow = slow.next;
        }
        
        ListNode start2 = reverse(end1, slow);

        while(start2!=null){

            if(start1.val!=start2.val){
                return false;
            }
            start1 = start1.next;
            start2 = start2.next;
        }

        return true;
    }

    public ListNode reverse(ListNode end1, ListNode slow){
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nex = slow;
        while(nex!=null){
            curr = nex;
            nex = curr.next;
            curr.next = prev;
            prev = curr;
        }

        end1.next = curr;

        return curr;

    }
}