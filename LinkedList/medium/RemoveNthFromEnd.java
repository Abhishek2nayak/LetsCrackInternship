package LinkedList.medium;
/*
 * 
class Solution {

    public int calcLength(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = calcLength(head);
        int target = len - n;
        if (target == 0) {
            head = head.next;
            return head;
        }
        int pointer = 1;

        ListNode temp = head;
        while (temp != null) {
            if (pointer == target) {
                ListNode key = temp.next;
                if (key == null) {
                    temp = null;
                } else {
                    temp.next = key.next;
                }

            }
            pointer++;
            temp = temp.next;
        }

        return head;

    }
}
 */