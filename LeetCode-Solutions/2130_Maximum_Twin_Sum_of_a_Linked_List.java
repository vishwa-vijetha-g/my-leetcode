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
    public int pairSum(ListNode head) {
        int size = 0;
        int maxTwinSum = 0;
        ListNode h = head;
        while(head != null){
            head = head.next;
            size++;
        }

        System.out.println(size);
        int half = size/2;
        int[] arr = new int[half];

        head = h;

        for(int i=0;i<half;i++){
            arr[i] = head.val;
            head = head.next;
        }   

        for(int i=half; i<size; i++){
            arr[size-i-1] = arr[size-i-1] + head.val;
            if(arr[size-i-1]>maxTwinSum){
                maxTwinSum = arr[size-i-1];
            }
            head = head.next;
        }

        return maxTwinSum;
    }
}