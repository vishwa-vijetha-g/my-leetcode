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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums)
            hs.add(n);

        ListNode ans = new ListNode();
        ListNode now = ans;
        ListNode curr = head;

        while(curr!=null){
            if(!hs.contains(curr.val)){
                now.next = new ListNode(curr.val);
                now = now.next;
            }
            curr = curr.next;
        }

        return ans.next;

    }
}