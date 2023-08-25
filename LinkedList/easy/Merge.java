package LinkedList.easy;

/*
 * lass Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode newList = new ListNode(0);
        ListNode head = null;
        while(head1 != null && head2 != null) {
            int data;
            if(head1.val <= head2.val) {
                data = head1.val;
                head1 = head1.next;
            } else {
                data = head2.val;
                head2 = head2.next;
            }

            ListNode new_node = new ListNode(data);
            newList.next = new_node;
            if(head == null) head = new_node;
            newList = new_node;


        }

        while(head1 != null ) {
            int data;
           
                data = head1.val;
                head1 = head1.next;

            ListNode new_node = new ListNode(data);
            newList.next = new_node;
            if(head == null) head = new_node;
            newList = new_node;


        }
           while(head2 != null ) {
            int data;
           
                data = head2.val;
                head2 = head2.next;

            ListNode new_node = new ListNode(data);
            newList.next = new_node;
            if(head == null) head = new_node;
            newList = new_node;


        }

        return head;
      

    }
}
 */