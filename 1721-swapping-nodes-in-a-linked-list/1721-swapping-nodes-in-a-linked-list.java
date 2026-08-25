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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode res = new ListNode(-1 , head) ; 
        ListNode dummy = res ; 
        for(int i = 0 ; i < k  - 1; i++){
            head = head.next ; 
        }
        ListNode pointer1 = head ; 
        while(head != null){
            head = head.next ; 
            dummy = dummy.next ; 
        }
        int temp = pointer1.val ; 
        pointer1.val = dummy.val ; 
        dummy.val = temp ; 
        return res.next ; 
    }
}