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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return ;

        ListNode list1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev!=null)
            prev.next = null;

        ListNode list2 = reverse(slow);

        while(list1!=null && list2!=null){
            ListNode l1next = list1.next;
            ListNode l2next = list2.next;

            list1.next = list2;
            if(l1next!=null)
                list2.next = l1next;

            list1 = l1next;
            list2 = l2next;
        }

    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}