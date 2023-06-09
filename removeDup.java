
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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;
        ListNode prev = head;
        ListNode curr = head.next;

        while(prev !=null && curr != null){
            if(prev.val == curr.val) curr = curr.next;
            else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = curr;
        return head; 
    }


}