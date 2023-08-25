package LinkedList.easy;

/*
 * class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = curr.next;
        while(nxt != null) {
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }

        curr.next = prev;
        return curr;
    }
}
 */
