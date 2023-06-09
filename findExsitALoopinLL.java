/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 class Solution {
    static {
        System.out.println("Hello");
    }
    public boolean hasCycle(ListNode head) {

        if(head == null) return false;
        ListNode curr = head;
        ListNode skip2 = head;

        while(skip2.next != null && skip2.next.next != null){
            curr = curr.next;
            skip2 = skip2.next.next;
            if(curr == skip2) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
