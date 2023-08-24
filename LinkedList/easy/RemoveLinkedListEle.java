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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null) {
            if(temp.val == val) {
                if(prev == null) {
                    ListNode nextNode = temp.next;
                    temp = null;
                    head = nextNode;
                    temp = nextNode;
                } else {
                    prev.next = temp.next;
                    temp = prev.next;
                }
            } else {
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}

 */