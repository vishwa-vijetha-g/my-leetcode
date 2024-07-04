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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        int val = 0;
        while(head!=null){
            if(head.val==0 && val!=0){
                ans.next = new ListNode(val);
                val = 0;
                ans = ans.next;
            }else{
                val = val + head.val;
                
            }
            head = head.next;
        }
        return ansHead.next;
    }
}