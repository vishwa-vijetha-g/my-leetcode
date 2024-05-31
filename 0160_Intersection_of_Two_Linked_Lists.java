/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;

        ListNode ha = headA;
        ListNode hb = headB;
        
        while(ha!=null){
            ha = ha.next;
            sizeA++;
        }

        while(hb!=null){
            hb = hb.next;
            sizeB++;
        }

        int sizeDiff = sizeA - sizeB;

        while(sizeA>sizeB && sizeDiff>0){
            headA = headA.next;
            sizeDiff--;
        }

        while(sizeA<sizeB && sizeDiff<0){
            headB = headB.next;
            sizeDiff++;
        }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}