package LinkedList.medium;
/*
 * class Solution {
    public ListNode partition(ListNode head, int x) {
        
      int n = calcLength(head);
        int [] nodes = nodesValue(head,n);

        ListNode temp = head;
        for(int _val : nodes) {
            if(temp == null) break;
            if(_val < x) {
                temp.val = _val;
                 temp= temp.next;
            } 
           
        }
     int idx = 0;
        
        while(temp != null && idx <n) {
            if(nodes[idx] >= x) {
                temp.val = nodes[idx];
                temp = temp.next;
            }
            idx++;
        }


        return head;


    }
        public int[] nodesValue(ListNode head, int n) {
        int[] arr = new int[n];
        int idx = 0;
        while(head != null) {
            arr[idx++]= head.val;
            head = head.next;
        }

        return arr;
    }
     public int calcLength(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
     }
}
 */