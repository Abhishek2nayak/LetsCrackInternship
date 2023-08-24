package LinkedList.easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode slow = head;
      
        while(slow != null) {
              ListNode fast = slow.next;
              while(fast != null && slow.val == fast.val) {
                  fast = fast.next;
              }

        slow.next = fast;
        slow = fast;

        }
  return head;
    }
}

*/
