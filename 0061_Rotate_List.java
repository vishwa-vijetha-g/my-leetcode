class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0)
            return head;
        
        int len = 1;
        ListNode end = head;

        while(end.next!=null){
            end = end.next;
            len++;
        }

        end.next = head;

        k = k % len;

        int move = len - k;

        while(move>0){
            end = end.next;
            move--;
        }

        head = end.next;
        end.next = null;

        return head;

    }
}