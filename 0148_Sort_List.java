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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;

        ArrayList<Integer> l = new ArrayList<>();

        ListNode curr = head;

        while(curr!=null){
            l.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(l);

        curr = head;

        for(Integer i:l){
            curr.val = i;
            curr = curr.next;
        }

        return head;

    }
}