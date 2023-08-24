package LinkedList.easy;

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
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = slow.next;
        while(slow != null && fast != null) {
            if(slow == fast) {
                return true;
            }

            slow = slow.next;
            if(fast.next != null) {
            fast = fast.next.next;
            } else {
                fast = fast.next;
            }
          
        }

        return false;
    }
}

*/