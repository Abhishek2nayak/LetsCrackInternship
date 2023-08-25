package LinkedList.easy;

/*
 * 
 * 
 * class Solution {
    public boolean isPalindrome(ListNode head) {
        
        int n = len(head);
        int [] seq = new int[n/2];
        int idx = 0;
        ListNode temp = head;
        while(idx < n/2 ) {
            seq[idx++] = temp.val;
            temp = temp.next;
        }

        if(n % 2 != 0) {
            temp = temp.next;
        }

        idx = seq.length -1;
        while(idx >= 0 && temp != null) {
            if(seq[idx] != temp.val) return false;
            idx--;
            temp = temp.next;
        }

        return true;

    }

    public int len(ListNode node) {
        int cnt = 0;
        while(node != null) {
            cnt++;
           node =  node.next;
        }

        return cnt;
    }
}
 */