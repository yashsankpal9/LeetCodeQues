class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if(headA == null || headB == null) return null;

        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if(ptr1 == ptr2) return ptr1;

            if(ptr1 == null) ptr1 = headA;
            if(ptr2 == null) ptr2 = headB;
        
        }

        return ptr1;
    }
}