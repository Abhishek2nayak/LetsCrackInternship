package LinkedList.medium;

/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseList(l1);
        ListNode head2 = reverseList(l2);
        ListNode new_node = new ListNode(0);
        ListNode head = null;
        
        int carry = 0;
        while(head1 != null || head2 != null || carry >0) {
            int sum = 0;
            if(head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
           if(head2 != null) {
               sum += head2.val;
               head2 = head2.next;
           }
            sum += carry;
            carry = sum / 10;
            ListNode n = new ListNode(sum % 10);
            if(head == null) {
                head = n;
            }


            new_node.next = n;
            new_node = n;

            


        }
          



        return reverseList(head);
    }

    //to reverse list
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
} */