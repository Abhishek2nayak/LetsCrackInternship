package LinkedList.easy;

/*
 * class Solution
{
    Node compute(Node head)
    {
        // your code here
        
        Node tail = reverse(head);
        
        int max = tail.data;
        Node prev = tail;
        Node temp = tail.next;
        
        while(temp != null) {
            if(temp.data < max) {
              
                //delete the node
                Node nxt = temp.next;
                prev.next = nxt;
                temp = nxt;
            } else {
                max = temp.data;
                prev = temp;
                temp = temp.next;
            }
        }
        
        Node head2 = reverse(tail);
        
        return head2;
        
        
        
        
    }
    
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node nxt = head.next;
        
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